package com.example.activitylifecycletest.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SummaryScreen() {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text("Selected Option: ")
        Text("<Selection>")
    }
}

@Preview
@Composable
fun SummaryScreenPreview() {
    SummaryScreen()
}