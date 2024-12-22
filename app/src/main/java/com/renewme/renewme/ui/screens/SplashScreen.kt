package com.renewme.renewme.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.renewme.renewme.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    // Splash ekranında bir süre beklemek için LaunchedEffect kullanıyoruz
    LaunchedEffect(Unit) {
        delay(3000) // 3 saniye boyunca Splash ekranını göster
        navController.navigate("onboarding") // Onboarding ekranına yönlendir
    }

    // Splash ekranının UI tasarımı
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF00CC00)), // Arka plan rengi
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Logoyu yerleştiriyoruz
            Image(
                painter = painterResource(id = R.drawable.ic_logo), // Drawable klasöründeki logo
                contentDescription = "RenewMe Logo",
                modifier = Modifier.size(100.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            // Yazıyı ekliyoruz
            androidx.compose.material3.Text(
                text = "RenewMe",
                color = Color.White,
                style = androidx.compose.material3.MaterialTheme.typography.headlineLarge
            )
        }
    }
}
