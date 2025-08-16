// पथ: app/src/main/java/com/genius/tdlibandroid/data/TelegramClientImpl.kt
package com.genius.tdlibandroid.data

import android.content.Context
import android.os.Build
import android.util.Log
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import org.drinkless.tdlib.Client
import org.drinkless.tdlib.TdApi
import java.io.File
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

@Singleton
class TelegramClientImpl @Inject constructor(
    @ApplicationContext private val context: Context
) : TelegramClient {

    private val client: Client
    private val scope = CoroutineScope(Dispatchers.IO + SupervisorJob())

    private val _updates = MutableSharedFlow<TdApi.Update>(replay = 10)
    override val updates = _updates.asSharedFlow()

    private val _authState = MutableStateFlow<AuthState>(AuthState.Uninitialized)
    override val authState = _authState.asStateFlow()

    init {
        Client.execute(TdApi.SetLogVerbosityLevel(1))

        // TDLib बाइंडिंग के अनुसार कॉलबैक पैरामीटर TdApi.Object है
        client = Client.create(
            { obj: TdApi.Object ->
                if (obj is TdApi.Update) {
                    scope.launch { _updates.emit(obj) }
                }
            },
            { error -> Log.e("TDLib", "Update handler error: $error") },
            { ex -> Log.e("TDLib", "Default exception handler: $ex") }
        )

        scope.launch {
            updates.collect { update ->
                if (update is TdApi.UpdateAuthorizationState) {
                    handleAuthorizationState(update.authorizationState)
                }
            }
        }
    }

    private fun handleAuthorizationState(state: TdApi.AuthorizationState) {
        val newState = when (state) {
            is TdApi.AuthorizationStateWaitTdlibParameters -> AuthState.WaitTdlibParameters
            is TdApi.AuthorizationStateWaitPhoneNumber    -> AuthState.WaitPhoneNumber
            is TdApi.AuthorizationStateWaitCode           -> AuthState.WaitCode
            is TdApi.AuthorizationStateWaitPassword       -> AuthState.WaitPassword
            is TdApi.AuthorizationStateReady              -> AuthState.Ready
            is TdApi.AuthorizationStateLoggingOut,
            is TdApi.AuthorizationStateClosing            -> AuthState.LoggingOut
            is TdApi.AuthorizationStateClosed             -> AuthState.Closed
            else                                          -> AuthState.Error("Unsupported authorization state: $state")
        }
        _authState.value = newState
        if (newState is AuthState.WaitTdlibParameters) setupTdlibParameters()
    }

    private fun setupTdlibParameters() {
        val baseDir = context.filesDir.absolutePath
        val dbDir   = File(baseDir, "td_database").absolutePath
        val files   = File(baseDir, "td_files").absolutePath

        // लंबे कंस्ट्रक्टर का सीधा उपयोग
        val setParams = TdApi.SetTdlibParameters(
            false,
            dbDir,
            files,
            ByteArray(0),
            true,
            true,
            true,
            true,
            27041199, // Your API ID
            "7f65bd72b0b483a9eddcfbc487b72420", // Your API Hash
            "en",
            Build.MODEL,
            Build.VERSION.RELEASE,
            "1.0.0"
        )

        scope.launch {
            try {
                send(setParams)
            } catch (e: Exception) {
                _authState.value = AuthState.Error(e.message ?: "Failed to set Tdlib parameters")
            }
        }
    }

    override suspend fun send(query: TdApi.Function<*>): TdApi.Object =
        suspendCoroutine { continuation ->
            client.send(query) { result ->
                when (result) {
                    is TdApi.Error -> continuation.resumeWithException(
                        RuntimeException("TDLib error: [code=${result.code}, message=${result.message}]")
                    )
                    else -> continuation.resume(result)
                }
            }
        }

    override suspend fun setPhoneNumber(phoneNumber: String) {
        send(TdApi.SetAuthenticationPhoneNumber(phoneNumber, null))
    }
    override suspend fun checkCode(code: String) {
        send(TdApi.CheckAuthenticationCode(code))
    }
    override suspend fun checkPassword(password: String) {
        send(TdApi.CheckAuthenticationPassword(password))
    }
    override suspend fun logOut() { send(TdApi.LogOut()) }
    override suspend fun getMe(): TdApi.User = send(TdApi.GetMe()) as TdApi.User

    override suspend fun getChats(limit: Int): List<TdApi.Chat> {
        send(TdApi.LoadChats(TdApi.ChatListMain(), limit))
        val result = send(TdApi.GetChats(TdApi.ChatListMain(), limit))
        return if (result is TdApi.Chats) result.chatIds.map { getChat(it) } else emptyList()
    }
    override suspend fun getChat(chatId: Long): TdApi.Chat =
        send(TdApi.GetChat(chatId)) as TdApi.Chat

    override suspend fun openChat(chatId: Long) {
        send(TdApi.OpenChat(chatId))
    }
    override suspend fun closeChat(chatId: Long) {
        send(TdApi.CloseChat(chatId))
    }

    override suspend fun getChatHistory(
        chatId: Long, fromMessageId: Long, offset: Int, limit: Int, onlyLocal: Boolean
    ): List<TdApi.Message> {
        val res = send(TdApi.GetChatHistory(chatId, fromMessageId, offset, limit, onlyLocal))
        return if (res is TdApi.Messages) res.messages?.toList() ?: emptyList() else emptyList()
    }

    override suspend fun getMessage(chatId: Long, messageId: Long): TdApi.Message =
        send(TdApi.GetMessage(chatId, messageId)) as TdApi.Message

    override suspend fun viewMessages(chatId: Long, messageIds: LongArray, forceRead: Boolean) {
        send(TdApi.ViewMessages(chatId, messageIds, null, forceRead))
    }

    override suspend fun sendTyping(chatId: Long) {
        send(TdApi.SendChatAction(chatId, 0L, null, TdApi.ChatActionTyping()))
    }

    override suspend fun sendTextMessage(
        chatId: Long, text: String, replyTo: Long?
    ): TdApi.Message {
        val content = TdApi.InputMessageText(
            TdApi.FormattedText(text, arrayOf()),
            null,
            true
        )
        val sendMsg = TdApi.SendMessage(
            chatId,
            0L,
            null,
            null,
            null,
            content
        )
        return send(sendMsg) as TdApi.Message
    }

    override suspend fun searchChats(query: String, limit: Int): List<TdApi.Chat> { TODO("Not yet implemented") }
    override suspend fun editMessageText(chatId: Long, messageId: Long, newText: String) { TODO("Not yet implemented") }
    override suspend fun deleteMessages(chatId: Long, ids: LongArray, revoke: Boolean) { TODO("Not yet implemented") }
    override suspend fun downloadFile(fileId: Int, priority: Int) { TODO("Not yet implemented") }
    override suspend fun getFile(fileId: Int): TdApi.File { TODO("Not yet implemented") }
}