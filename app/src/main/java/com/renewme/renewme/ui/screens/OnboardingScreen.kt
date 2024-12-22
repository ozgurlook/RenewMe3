package com.renewme.renewme.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun OnboardingScreen(navController: NavHostController) {
    val pagerState = rememberPagerState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF00CC00)),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HorizontalPager(
            count = 5,
            state = pagerState,
            modifier = Modifier.weight(1f)
        ) { page ->
            OnboardingPage(page)
        }

        HorizontalPagerIndicator(
            pagerState = pagerState,
            activeColor = Color.White,
            inactiveColor = Color.Gray,
            modifier = Modifier.padding(16.dp)
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            if (pagerState.currentPage == 4) {
                Button(
                    onClick = { navController.navigate("support") },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(text = "Start")
                }
            } else {
                TextButton(
                    onClick = { navController.navigate("support") },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(text = "Skip", color = Color.White)
                }
            }
        }
    }
}
@Composable
fun OnboardingPage(page: Int) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        when (page) {
            0 -> OnboardingText(
                title = "Your journey\nto renewal\nstarts here",
                description = null
            )
            1 -> OnboardingText(
                title = "Stay\nMotivated",
                description = "Receive reminders and encouragement to keep going"
            )
            2 -> OnboardingText(
                title = "Build Healthy\nHabits",
                description = "Create lasting changes with personalized habit tracking"
            )
            3 -> OnboardingText(
                title = "Connect With\nSupport",
                description = "Join a community of like-minded individuals and mentors"
            )
            4 -> OnboardingText(
                title = "Emergency Support",
                description = "Access instant support in moments of challenge"
            )
        }
    }
}

@Composable
fun OnboardingText(title: String, description: String?) {
    BasicText(
        text = title,
        style = androidx.compose.ui.text.TextStyle(
            color = Color.White,
            fontSize = 40.sp,
            textAlign = TextAlign.Start,
            fontWeight = FontWeight.Bold
        ),
        modifier = Modifier.fillMaxWidth()
    )

    description?.let {
        Spacer(modifier = Modifier.height(8.dp))
        BasicText(
            text = it,
            style = androidx.compose.ui.text.TextStyle(
                color = Color.White,
                fontSize = 24.sp,
                textAlign = TextAlign.Start
            ),
            modifier = Modifier.fillMaxWidth()
        )
    }
}
