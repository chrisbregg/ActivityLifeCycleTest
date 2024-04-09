package com.example.activitylifecycletest.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun StartScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        Text(text = "Get Started")
        Button(
            onClick = { /*TODO*/ }
        ) {
            Text("Next")
        }
    }
}

@Preview
@Composable
fun StartScreenPreview() {
    StartScreen()
}