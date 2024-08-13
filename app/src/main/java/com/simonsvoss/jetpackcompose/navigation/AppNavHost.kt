package com.simonsvoss.jetpackcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.simonsvoss.jetpackcompose.ui.screens.MainScreen
import com.simonsvoss.jetpackcompose.ui.screens.SettingScreen

@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(navController, startDestination = Destination.Main) {
        composable<Destination.Main> {
            MainScreen(onNavigateToProfile = {
                navController.navigate(Destination.Setting("username", "username@gmail.com"))
            })
        }
        composable<Destination.Setting> {
            SettingScreen(onNavigateToBack = { navController.popBackStack() })
        }
    }
}
