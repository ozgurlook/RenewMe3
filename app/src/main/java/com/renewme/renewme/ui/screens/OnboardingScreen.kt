package com.renewme.renewme.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState
import androidx.navigation.NavController
import androidx.compose.ui.text.font.FontWeight

import com.renewme.renewme.R

@OptIn(ExperimentalPagerApi::class)
@Composable
fun OnboardingScreen(navController: NavController) {
    val pagerState = rememberPagerState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF00CC00)), // Arka plan yeşil
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Horizontal Pager
        HorizontalPager(
            count = 5, // 5 farklı sayfa
            state = pagerState,
            modifier = Modifier.weight(1f)
        ) { page ->
            OnboardingPage(page)
        }

        // Sayfa göstergesi (dots)
        HorizontalPagerIndicator(
            pagerState = pagerState,
            activeColor = Color.White,
            inactiveColor = Color.Gray,
            modifier = Modifier.padding(16.dp)
        )

        // Skip veya Başla Butonu
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            if (pagerState.currentPage == 4) { // Son sayfa
                androidx.compose.material3.Button(
                    onClick = { navController.navigate("home") }, // Ana ekrana yönlendir
                    modifier = Modifier.padding(16.dp)
                ) {
                    androidx.compose.material3.Text(text = "Start")
                }
            } else {
                androidx.compose.material3.TextButton(
                    onClick = { navController.navigate("home") }, // Atla
                    modifier = Modifier.padding(16.dp)
                ) {
                    androidx.compose.material3.Text(text = "Skip", color = Color.White)
                }
            }
        }
    }
}

@Composable
fun OnboardingPage(page: Int) {
    Column(
        modifier = Modifier66666666sexsexawaww






















































































            .fillMaxSize()
            .padding(32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        when (page) {
            0 -> {
                BasicText(
                    text = "Your journey\n to renewal\n starts here",
                    style = androidx.compose.ui.text.TextStyle(
                        color = Color.White,
                        fontSize =40 .sp,
                        textAlign = TextAlign.Start,
                        fontWeight = FontWeight.Bold,

                    )
                )
            }
            1 -> {
                BasicText(
                    text = "Stay\nMotivated",
                    style = androidx.compose.ui.text.TextStyle(
                        color = Color.White,
                        fontSize = 40.sp,
                        textAlign = TextAlign.Start ,
                        fontWeight = FontWeight.Bold
                    )
                )
                BasicText(
                    text = "Receive reminders and encouragement to keep going",
                    style = androidx.compose.ui.text.TextStyle(
                        color = Color.White,
                        fontSize = 24.sp,
                        textAlign = TextAlign.Start
                    )
                )
            }
            2 -> {
                BasicText(
                    text = "Build Healthy\nHabits",
                    style = androidx.compose.ui.text.TextStyle(
                        color = Color.White,
                        fontSize = 40.sp,
                        textAlign = TextAlign.Start,
                                fontWeight = FontWeight.Bold
                    )
                )
                BasicText(
                    text = "Create lasting changes with personalized habit tracking",
                    style = androidx.compose.ui.text.TextStyle(
                        color = Color.White,
                        fontSize = 24.sp,
                        textAlign = TextAlign.Start
                    )
                )
            }
            3 -> {
                BasicText(
                    text = "Connect With\n Support",
                    style = androidx.compose.ui.text.TextStyle(
                        color = Color.White,
                        fontSize = 40.sp,
                        textAlign = TextAlign.Start,
                        fontWeight = FontWeight.Bold

                    )
                )
                BasicText(
                    text = "Join a community of like-minded individuals and mentors",
                    style = androidx.compose.ui.text.TextStyle(
                        color = Color.White,
                        fontSize = 24.sp,
                        textAlign = TextAlign.Start
                    )
                )
            }
            4 -> {
                BasicText(
                    text = "Emergency Support",
                    style = androidx.compose.ui.text.TextStyle(
                        color = Color.White,
                        fontSize = 40.sp,
                        textAlign = TextAlign.Start,
                                fontWeight = FontWeight.Bold
                    )
                )
                BasicText(
                    text = "Access instant support in moments of challenge",
                    style = androidx.compose.ui.text.TextStyle(
                        color = Color.White,
                        fontSize = 24.sp,
                        textAlign = TextAlign.Start
                    ))
            }
        }
    }
}
