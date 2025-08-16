// पथ: app/src/main/java/com/genius/tdlibandroid/presentation/navigation/AppNavGraph.kt
package com.genius.tdlibandroid.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.genius.tdlibandroid.presentation.chat.ChatScreen
import com.genius.tdlibandroid.presentation.home.HomeScreen
import com.genius.tdlibandroid.presentation.home.HomeViewModel

@Composable
fun AppNavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = NavRoutes.CHAT_LIST,
        modifier = modifier
    ) {
        composable(route = NavRoutes.CHAT_LIST) {
            val homeViewModel: HomeViewModel = hiltViewModel()
            HomeScreen(
                viewModel = homeViewModel,
                // ⭐ नेविगेशन के लिए कॉलबैक पास किया गया
                onChatClick = { chatId ->
                    navController.navigate(NavRoutes.chat(chatId))
                }
            )
        }

        // ⭐⭐ नई चैट स्क्रीन को यहाँ जोड़ा गया है ⭐⭐
        composable(
            route = NavRoutes.CHAT,
            arguments = listOf(navArgument("chatId") { type = NavType.LongType })
        ) { backStackEntry ->
            val chatId = backStackEntry.arguments?.getLong("chatId") ?: 0L
            if (chatId > 0) {
                ChatScreen(chatId = chatId)
            }
        }

        composable(route = NavRoutes.SETTINGS) {
            // भविष्य में यहाँ SettingsScreen आएगी।
        }
    }
}