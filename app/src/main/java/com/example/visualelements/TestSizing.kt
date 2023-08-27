package com.example.visualelements

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TestSizing() {
    Row(modifier = Modifier.background(Color(0xffcccccc))) {
//        Column(modifier = Modifier
//            .width(200.dp)
//            .height(100.dp)
//            .background(Color.DarkGray)) {}
//        Column(modifier = Modifier
//            .fillMaxWidth(0.4f)
//            .height(100.dp)
//            .background(Color.Magenta)) {
//
//        }
//        Column(modifier = Modifier
//            .fillMaxWidth(0.4f)
//            .aspectRatio(0.3f)
//            .background(Color.Magenta)) {
//
//        }
        Column(modifier = Modifier
            .weight(1f)
            .height(100.dp)
            .background(Color.DarkGray)) {

        }
        Spacer(modifier = Modifier.width(10.dp))
        Column(modifier = Modifier
            .weight(2f)
            .height(100.dp)
            .background(Color.Cyan)) {

        }
        Column(modifier = Modifier
            .width(100.dp)
            .height(100.dp)
            .background(Color.DarkGray)) {

        }
        Spacer(modifier = Modifier.width(10.dp))
        Column(modifier = Modifier
            .width(100.dp)
            .height(100.dp)
            .background(Color.Cyan)) {}
        Text(text = "This is a sample text", fontSize = 20.sp)
    }
}