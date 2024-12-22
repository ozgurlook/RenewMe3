package com.renewme.renewme.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.renewme.renewme.ui.screens.SplashScreen
import com.renewme.renewme.ui.screens.OnboardingScreen

@Composable
fun NavGraph(navController: NavHostController) {
    // NavHost: Ekranlar arası geçişi yönetir
    NavHost(
        navController = navController,
        startDestination = "splash" // Uygulama açıldığında ilk olarak Splash ekranı gösterilecek
    ) {
        // Splash Screen
        composable("splash") {
            SplashScreen(navController) // Splash ekranını çağır
        }
        // Onboarding Screen
        composable("onboarding") {
            OnboardingScreen(navController) // Onboarding ekranını çağır
        }
    }
}
