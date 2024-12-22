package com.renewme.renewme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.renewme.renewme.navigation.NavGraph
import com.renewme.renewme.viewmodel.UserDataViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            val userDataViewModel: UserDataViewModel = viewModel()

            NavGraph(
                navController = navController,
                userDataViewModel = userDataViewModel
            )
        }
    }
}
