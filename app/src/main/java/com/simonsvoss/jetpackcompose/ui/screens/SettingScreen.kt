package com.simonsvoss.jetpackcompose.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SettingScreen(onNavigateToBack: () -> Unit) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Setting Screen",
                style = MaterialTheme.typography.labelLarge
            )
            Button(onClick = onNavigateToBack) {
                Text(text = "Go back")
            }
        }
    }
}

@Preview
@Composable
fun SettingScreenPreview() {
    SettingScreen {}
}
