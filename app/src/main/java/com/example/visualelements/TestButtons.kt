package com.example.visualelements

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable

fun TestButtons() {
    val context = LocalContext.current
    val imageRes = painterResource(id = R.drawable.me_munin_quinn)
    val btnImage = painterResource(id = R.drawable.ic_user)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = { Toast.makeText(context, "button clicked", Toast.LENGTH_LONG).show() },
            modifier = Modifier
                .fillMaxWidth(1f)
                .height(80.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Cyan,
                contentColor = Color.Yellow
            )
        ) {
            Image(
                painter = btnImage,
                contentDescription = null,
                contentScale = ContentScale.FillWidth)
            Text(
                text = " le Persånn",
                fontWeight = FontWeight.Bold,
                fontSize = 23.sp)
        }

    }
}