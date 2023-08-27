package com.example.visualelements

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.stringResource

@Composable
fun TestText() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        
        Text(text = "A simple hardcoded text")
        Text(text = stringResource(id = R.string.hello_text))
        
    }
}