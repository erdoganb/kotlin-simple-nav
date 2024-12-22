package com.example.simplenav

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun FirstScreen(NavigateToSecondScreen: () -> Unit) {
    var nameValue by remember { mutableStateOf("No Name") }


    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "GGWP",
            color = Color.Red,
            fontSize = 80.sp,
        )

        OutlinedTextField(
            value = nameValue,
            singleLine = true,
            onValueChange = { nameValue = it })

        Button(onClick = { NavigateToSecondScreen() }) {
            Text(text = "GO!")

        }
    }
}
