// पथ: app/src/main/java/com/genius/tdlibandroid/presentation/chat/ChatViewModel.kt
package com.genius.tdlibandroid.presentation.chat

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.genius.tdlibandroid.data.TelegramClient
import com.genius.tdlibandroid.data.tgRepos.TgChatRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.drinkless.tdlib.TdApi
import javax.inject.Inject

data class ChatUiState(
    val isLoading: Boolean = false,
    val messages: List<TdApi.Message> = emptyList(),
    val input: String = "",
    val error: String? = null
)

@HiltViewModel
class ChatViewModel @Inject constructor(
    private val repo: TgChatRepository,
    private val client: TelegramClient
) : ViewModel() {

    private var chatId: Long = 0L
    private var updatesJob: Job? = null

    private val _ui = MutableStateFlow(ChatUiState(isLoading = true))
    val ui: StateFlow<ChatUiState> = _ui

    fun init(chatId: Long) {
        if (this.chatId == chatId && _ui.value.messages.isNotEmpty()) return
        this.chatId = chatId

        viewModelScope.launch {
            try {
                _ui.update { it.copy(isLoading = true, error = null) }
                repo.openChat(chatId)
                val page = repo.getHistory(chatId, fromMessageId = 0L, limit = 50)
                _ui.update { it.copy(isLoading = false, messages = page) }
                startUpdates()
            } catch (e: Exception) {
                _ui.update { it.copy(isLoading = false, error = e.message) }
            }
        }
    }

    private fun startUpdates() {
        updatesJob?.cancel()
        updatesJob = viewModelScope.launch {
            client.updates.collect { upd ->
                when (upd) {
                    is TdApi.UpdateNewMessage -> {
                        if (upd.message.chatId == chatId) {
                            _ui.update { st -> st.copy(messages = (st.messages + upd.message)) }
                        }
                    }
                    is TdApi.UpdateDeleteMessages -> {
                        if (upd.chatId == chatId) {
                            val del = upd.messageIds.toSet()
                            _ui.update { st ->
                                st.copy(messages = st.messages.filterNot { it.id in del })
                            }
                        }
                    }
                    // ⭐ UpdateMessageContent हैंडलिंग को यहाँ ठीक किया गया है
                    is TdApi.UpdateMessageContent -> {
                        if (upd.chatId == chatId) {
                            launch { // एक नया coroutine लॉन्च करें ताकि UI ब्लॉक न हो
                                try {
                                    val freshMessage = repo.getMessage(upd.chatId, upd.messageId)
                                    _ui.update { currentState ->
                                        currentState.copy(
                                            messages = currentState.messages.map {
                                                if (it.id == freshMessage.id) freshMessage else it
                                            }
                                        )
                                    }
                                } catch (e: Exception) {
                                    // संदेश प्राप्त करने में विफल होने पर एरर हैंडल करें
                                    e.printStackTrace()
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    fun onInputChange(text: String) {
        _ui.update { it.copy(input = text) }
        viewModelScope.launch { repo.sendTyping(chatId) }
    }

    fun sendMessage() {
        val text = _ui.value.input.trim()
        if (text.isEmpty()) return
        viewModelScope.launch {
            try {
                // संदेश भेजने के बाद UI को तुरंत अपडेट करने के बजाय,
                // हम UpdateNewMessage पर निर्भर रहेंगे जो TDLib से आएगा।
                repo.sendText(chatId, text, replyTo = null)
                _ui.update { it.copy(input = "") }
            } catch (e: Exception) {
                _ui.update { it.copy(error = e.message) }
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        updatesJob?.cancel()
        viewModelScope.launch { repo.closeChat(chatId) }
    }
}