package com.example.visualelements

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlin.math.log

@Composable
fun TestModifiers() {

    var text = "Test modifier"

    Column(modifier = Modifier
        .padding(16.dp)
        .background(Color(0x440000FF))
        .clickable {  }
        .padding(30.dp)
    ) {
        Text(text = text, modifier = Modifier.background(Color.Cyan))
    }
}