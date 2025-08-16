// पथ: app/src/main/java/com/genius/tdlibandroid/data/TelegramClient.kt
package com.genius.tdlibandroid.data

import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import org.drinkless.tdlib.TdApi

interface TelegramClient {
    val updates: SharedFlow<TdApi.Update>
    val authState: StateFlow<AuthState>

    suspend fun send(query: TdApi.Function<*>): TdApi.Object

    // Auth / session
    suspend fun setPhoneNumber(phoneNumber: String)
    suspend fun checkCode(code: String)
    suspend fun checkPassword(password: String)
    suspend fun logOut()
    suspend fun getMe(): TdApi.User

    // Chats
    suspend fun getChats(limit: Int): List<TdApi.Chat>
    suspend fun getChat(chatId: Long): TdApi.Chat
    suspend fun searchChats(query: String, limit: Int): List<TdApi.Chat>
    suspend fun openChat(chatId: Long)
    suspend fun closeChat(chatId: Long)

    // Messages / history
    suspend fun getChatHistory(
        chatId: Long,
        fromMessageId: Long,
        offset: Int,
        limit: Int,
        onlyLocal: Boolean
    ): List<TdApi.Message>

    suspend fun getMessage(chatId: Long, messageId: Long): TdApi.Message
    suspend fun viewMessages(chatId: Long, messageIds: LongArray, forceRead: Boolean)
    suspend fun sendTyping(chatId: Long)
    suspend fun sendTextMessage(chatId: Long, text: String, replyTo: Long?): TdApi.Message
    suspend fun editMessageText(chatId: Long, messageId: Long, newText: String)
    suspend fun deleteMessages(chatId: Long, ids: LongArray, revoke: Boolean)
    suspend fun downloadFile(fileId: Int, priority: Int)
    suspend fun getFile(fileId: Int): TdApi.File
}