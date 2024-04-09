package com.example.activitylifecycletest.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SelectScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = "Select a value"
        )
        SelectionRow("1", true)
        SelectionRow("2", false)
        SelectionRow("3", false)
    }
}

@Composable
fun SelectionRow(
    value: String,
    selected: Boolean
) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        RadioButton(selected = selected, onClick = { /*TODO*/ })
        Text(value)
    }
}

@Preview
@Composable
fun SelectScreenPreview() {
    SelectScreen()
}