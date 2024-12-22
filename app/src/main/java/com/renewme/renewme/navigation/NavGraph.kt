package com.renewme.renewme.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.renewme.renewme.ui.screens.AddictionScreen
import com.renewme.renewme.ui.screens.InputScreen
import com.renewme.renewme.ui.screens.SupportScreen
import com.renewme.renewme.ui.screens.SplashScreen
import com.renewme.renewme.ui.screens.OnboardingScreen
import com.renewme.renewme.viewmodel.UserDataViewModel


@Composable
fun NavGraph(
    navController: NavHostController,
    userDataViewModel: UserDataViewModel
) {
    NavHost(
        navController = navController,
        startDestination = "splash"
    ) {
        composable("splash") {
            SplashScreen(navController)
        }
        composable("onboarding") {
            OnboardingScreen(navController)
        }
        composable("support") {
            SupportScreen(
                viewModel = userDataViewModel,
                onNext = { navController.navigate("addiction") }
            )
        }
        composable("addiction") {
            AddictionScreen { addiction ->
                userDataViewModel.addiction = addiction
                navController.navigate("input/age")
            }
        }
        composable("input/{field}") { backStackEntry ->
            val field = backStackEntry.arguments?.getString("field") ?: ""
            InputScreen(
                viewModel = userDataViewModel,
                field = field,
                onNext = {
                    when (field) {
                        "age" -> navController.navigate("input/weight")
                        "weight" -> navController.navigate("input/height")
                        "height" -> navController.navigate("done")
                        else -> navController.popBackStack()
                    }
                }
            )
        }
    }
}