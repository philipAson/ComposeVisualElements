package com.example.visualelements

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable

fun ExerciseLayout() {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .background(Color.LightGray)
            .padding(30.dp)) {

        Row(modifier = Modifier.fillMaxWidth(1f),
            horizontalArrangement = Arrangement.SpaceBetween)
        {
            Column(modifier = Modifier
                .width(100.dp)
                .height(50.dp)
                .background(Color.Red)) {}
            Column(modifier = Modifier
                .width(100.dp)
                .height(50.dp)
                .background(Color.Green)) {}
            Column(modifier = Modifier
                .width(100.dp)
                .height(50.dp)
                .background(Color.Blue)) {}
        }

        Column(modifier = Modifier.fillMaxWidth(1f).height(50.dp).background(Color.Yellow)) {}
        Column(modifier = Modifier.fillMaxWidth(1f).height(50.dp).background(Color(0xffffaa00))) {}
        Column(modifier = Modifier.fillMaxWidth(1f).height(50.dp).background(Color(0xffff00ff))) {}

        Box(contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth(1f)
                .height(150.dp)
                .background(Color(0xff0055ff))) {
            Column(modifier = Modifier
                .fillMaxSize(0.75f)
                .height(50.dp)
                .background(Color.Gray)) {}

            Column(modifier = Modifier
                .fillMaxSize(0.5f)
                .height(50.dp)
                .background(Color.Blue)) {}
        }
    }
}