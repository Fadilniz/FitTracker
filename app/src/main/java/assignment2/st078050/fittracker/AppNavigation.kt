package assignment2.st078050.fittracker

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "splash"
    ) {
        composable("splash") {
            SplashScreen(onContinue = {
                navController.navigate("login")
            })
        }

        composable("login") {
            LoginScreen(onLoginClick = {
                navController.navigate("home")
            })
        }

        composable("home") {
            HomeScreen(onNavigate = { route ->
                navController.navigate(route)
            })
        }

        composable("stats") {
            StatsScreen()
        }

        composable("settings") {
            SettingsScreen()
        }
    }
}
