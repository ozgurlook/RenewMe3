package com.renewme.renewme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.renewme.renewme.navigation.NavGraph
import com.renewme.renewme.ui.theme.RenewMeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RenewMeTheme {
                // Navigation Controller oluşturuluyor
                val navController = rememberNavController()
                // NavGraph çağrılarak ekranlar arası geçiş yönetiliyor
                NavGraph(navController = navController)
            }
        }
    }
}
