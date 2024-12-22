package com.renewme.renewme.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.renewme.renewme.viewmodel.UserDataViewModel

@Composable
fun SupportScreen(viewModel: UserDataViewModel, onNext: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "What type of support do you need?", style = MaterialTheme.typography.headlineMedium)

        Spacer(modifier = Modifier.height(16.dp))

        val options = listOf(
            "Addiction progress tracking",
            "Medication reminders",
            "Psychological support",
            "Seeking healthcare services"
        )

        options.forEach { option ->
            Button(
                onClick = {
                    viewModel.support = option // setSupport yerine doğrudan atama
                    onNext()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            ) {
                Text(text = option)
            }

        }
    }
}
