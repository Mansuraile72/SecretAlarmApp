// पथ: app/src/main/java/com/genius/tdlibandroid/presentation/navigation/NavRoutes.kt
package com.genius.tdlibandroid.presentation.navigation

object NavRoutes {
    const val LOGIN_GRAPH = "login_graph"
    const val MAIN_GRAPH = "main_graph"

    const val CHAT_LIST = "chat_list"
    const val CHAT = "chat/{chatId}" // ⭐ यह नया रूट है
    const val SETTINGS = "settings"

    // ⭐ यह नया हेल्पर फंक्शन है
    fun chat(chatId: Long): String = "chat/$chatId"
}