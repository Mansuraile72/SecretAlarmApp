// पथ: app/src/main/java/com/genius/tdlibandroid/presentation/chat/ChatScreen.kt
package com.genius.tdlibandroid.presentation.chat

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.flowWithLifecycle
import org.drinkless.tdlib.TdApi

@Composable
fun ChatScreen(
    chatId: Long,
    viewModel: ChatViewModel = hiltViewModel()
) {
    LaunchedEffect(chatId) { viewModel.init(chatId) }

    val lifecycle = LocalLifecycleOwner.current.lifecycle

    // ⭐⭐⭐ यहाँ Lint एरर को ठीक किया गया है ⭐⭐⭐
    val uiState by remember(viewModel.ui, lifecycle) {
        viewModel.ui.flowWithLifecycle(lifecycle, Lifecycle.State.STARTED)
    }.collectAsState(initial = ChatUiState(isLoading = true))

    val listState = rememberLazyListState()

    LaunchedEffect(uiState.messages.size) {
        if (uiState.messages.isNotEmpty()) {
            listState.animateScrollToItem(uiState.messages.lastIndex)
        }
    }

    Scaffold(
        bottomBar = {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                OutlinedTextField(
                    modifier = Modifier.weight(1f),
                    value = uiState.input,
                    onValueChange = viewModel::onInputChange,
                    placeholder = { Text("Message…") },
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(imeAction = ImeAction.Send),
                    keyboardActions = KeyboardActions(
                        onSend = { viewModel.sendMessage() }
                    )
                )
                Spacer(Modifier.width(8.dp))
                Button(onClick = { viewModel.sendMessage() }) {
                    Text("Send")
                }
            }
        }
    ) { inner ->
        Column(Modifier.padding(inner)) {
            if (uiState.isLoading && uiState.messages.isEmpty()) {
                Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    CircularProgressIndicator()
                }
            } else {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    state = listState
                ) {
                    items(uiState.messages, key = { it.id }) { msg ->
                        MessageBubble(
                            message = msg,
                            isOutgoing = msg.isOutgoing
                        )
                    }
                }
            }
            uiState.error?.let { err ->
                Text(
                    text = err,
                    color = MaterialTheme.colorScheme.error,
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}

@Composable
private fun MessageBubble(message: TdApi.Message, isOutgoing: Boolean) {
    val bubbleColor = if (isOutgoing) MaterialTheme.colorScheme.primaryContainer
    else MaterialTheme.colorScheme.surfaceVariant

    val text = when (val c = message.content) {
        is TdApi.MessageText -> c.text?.text ?: ""
        is TdApi.MessagePhoto -> "[photo]"
        is TdApi.MessageDocument -> "[document]"
        else -> "[unsupported]"
    }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 4.dp),
        horizontalArrangement = if (isOutgoing) Arrangement.End else Arrangement.Start
    ) {
        Surface(
            color = bubbleColor,
            shape = MaterialTheme.shapes.medium,
            tonalElevation = 1.dp
        ) {
            Text(text, modifier = Modifier.padding(10.dp))
        }
    }
}