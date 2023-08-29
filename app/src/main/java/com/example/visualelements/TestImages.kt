package com.example.visualelements

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun TestImages() {
    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceEvenly) {

        Row(modifier = Modifier
            .fillMaxWidth(1f)
            .height(400.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            val imgRes = painterResource(id = R.drawable.me_munin_quinn)
            Image(painter = imgRes, contentDescription = null, contentScale = ContentScale.FillWidth)
        }

        val iconRes = painterResource(id = R.drawable.ic_paragliding)
        Image(painter = iconRes, contentDescription = null, colorFilter = ColorFilter.tint(Color.Green))

        AsyncImage(
            model = "https://upload.wikimedia.org/wikipedia/commons/5/50/Rafeiro_male.jpg",
            contentDescription = null
        )
    }
    

}