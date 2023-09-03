package com.example.visualelements

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color

/*
        PROGRESS INDICATORS
    * Let the user know that something is happening in the background.

        * Linear: LinearProgressIndicator()
        * Circular: CircularProgressIndicator()
*/


@Composable
fun TestProgressIndicators() {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        LinearProgressIndicator()
        LinearProgressIndicator(0.2f)
        CircularProgressIndicator()
        CircularProgressIndicator(0.5f, modifier = Modifier.fillMaxSize(0.5f).scale(2f), color = Color.Cyan)

    }
}