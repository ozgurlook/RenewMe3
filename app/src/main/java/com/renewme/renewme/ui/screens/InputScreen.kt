package com.renewme.renewme.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.renewme.renewme.viewmodel.UserDataViewModel

@Composable
fun InputScreen(
    viewModel: UserDataViewModel,
    field: String,
    onNext: () -> Unit
) {
    var input by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Your $field",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = input,
            onValueChange = { input = it },
            label = { Text(text = "Enter your $field") },
            keyboardOptions = KeyboardOptions(
                keyboardType = if (field == "age" || field == "weight" || field == "height") KeyboardType.Number else KeyboardType.Text
            ),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                when (field) {
                    "age" -> viewModel.age = input // setAge yerine doğrudan atama
                    "weight" -> viewModel.weight = input // setWeight yerine doğrudan atama
                    "height" -> viewModel.height = input // setHeight yerine doğrudan atama
                }
                onNext()
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Next")
        }
    }
}
