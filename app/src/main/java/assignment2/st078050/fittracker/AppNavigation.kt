package assignment2.st078050.fittracker

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
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
            SplashScreen(
                onContinue = {
                    navController.navigate("login")
                }
            )
        }

        composable("login") {
            LoginScreen(
                onLoginClick = {
                    // soon go to home
                }
            )
        }
    }
}
