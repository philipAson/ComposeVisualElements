package com.example.visualelements

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun TestImages() {
    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceEvenly) {

        Row(modifier = Modifier
                .fillMaxWidth(1f)
                .height(400.dp),
            horizontalArrangement = Arrangement.Center) {
            val imgRes = painterResource(id = R.drawable.me_munin_quinn)
            Image(painter = imgRes, contentDescription = null)
        }
    }
    

}