package com.example.visualelements
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.consumeAllChanges
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import kotlin.math.roundToInt

/*
        GESTURES

    * Make an element CLICKABLE / tap, swipe, pinch, etc..

    * Detect gestures
            * modifier = Modifier.pointerInput(Unit) {
                detectTapGestures (
                    onPress = { ... },
                    onLongPress = { ... },
                    onTap = { ... },
                    onLongTap = { ... }
                )
        }

*/

@Composable
fun Gestures1() {
    val gestureDetection = remember { mutableStateOf("no gesture") }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = gestureDetection.value)
        var txtState by remember { mutableStateOf(0) }
        Box(modifier = Modifier
            .size(200.dp)
            .clickable { txtState += 1 }
            .pointerInput(Unit) {
                detectTapGestures(
                    onTap = { gestureDetection.value = "onTap x: ${it.x}, ${it.y}" },
                    onPress = { gestureDetection.value = "onPress" },
                    onDoubleTap = { gestureDetection.value = "onTap" },
                    onLongPress = { gestureDetection.value = "onTap" },
                )
            }
        ) {

            Text(text = "Clicked $txtState times", modifier = Modifier.align(Alignment.Center))
            }

        }
    }

@Composable
fun Gestures2() {
    var offsetX by remember { mutableStateOf(0f) }
    var offsetY by remember { mutableStateOf(0f) }

    Column(modifier = Modifier.fillMaxSize(1f)) {
        Box(modifier = Modifier
            .offset { IntOffset(offsetX.roundToInt(), offsetY.roundToInt()) }
            .size(100.dp)
            .background(Color.Red)
            .pointerInput(Unit) {
                detectDragGestures { change, dragAmount ->
                    change.consumeAllChanges()
                    offsetX += dragAmount.x
                    offsetY += dragAmount.y
                }
            }
        ) {
            
        }
    }
}