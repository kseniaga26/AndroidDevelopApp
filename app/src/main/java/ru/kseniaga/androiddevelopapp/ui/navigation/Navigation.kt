package ru.kseniaga.androiddevelopapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.compose.ui.Modifier
import ru.kseniaga.androiddevelopapp.models.getTitleById
import ru.kseniaga.androiddevelopapp.screen.MainScreen
import ru.kseniaga.androiddevelopapp.screen.NotificationsScreen
import ru.kseniaga.androiddevelopapp.screen.PersonalAccountScreen
import ru.kseniaga.androiddevelopapp.screen.TitleDetailScreen
import ru.kseniaga.androiddevelopapp.screen.TitlesListScreen
import ru.kseniaga.androiddevelopapp.ui.theme.AndroidDevelopAppTheme

@Composable
fun NavigationGraph(navController: NavHostController, modifier: Modifier) {
    NavHost(navController = navController, startDestination = "Home", modifier = modifier) {
        composable("Home") { MainScreen() }
        composable("Notification") { NotificationsScreen() }
        composable("TitlesList") { TitlesListScreen(modifier, navController) }
        composable("PersonalAccount") { PersonalAccountScreen() }
        composable("TitleDetail/{titleId}") { backStackEntry ->
            val titleId = backStackEntry.arguments?.getString("titleId")
            titleId?.let {
                val title = getTitleById(it.toInt())
                if (title != null) {
                    AndroidDevelopAppTheme{
                    TitleDetailScreen(title, navController)}
                }
            }
        }
    }
}

