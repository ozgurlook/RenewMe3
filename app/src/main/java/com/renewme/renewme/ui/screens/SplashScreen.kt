package com.renewme.renewme.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController) {
    // LaunchedEffect, gecikme ve yönlendirme işlevini çalıştırmak için kullanılır
    LaunchedEffect(Unit) {
        delay(2000) // 2 saniye bekleme
        navController.navigate("onboarding") {
            popUpTo("splash") { inclusive = true } // Splash ekranına geri dönmeyi engelle
        }
    }

    // Splash ekranının tasarımı
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "RenewMe",
            fontSize = 32.sp,
            textAlign = TextAlign.Center
        )
    }
}
