package com.example.visualelements

import android.provider.ContactsContract.CommonDataKinds.Im
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import coil.compose.AsyncImage

@Composable
fun ExerciseBuildThisLayout() {
    val context = LocalContext.current
    val imageResource = painterResource(id = R.drawable.me_munin_quinn)

    Column() {
        Spacer(modifier = Modifier.padding(16.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth(1f),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

                Box(modifier = Modifier
                    .size(125.dp)
                    .background(Color.Gray, CircleShape)

                ) {
                    Image(
                        painter = imageResource,
                        contentDescription = null,
                        modifier = Modifier
                            .clip(CircleShape)
                            .fillMaxSize())
                }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "21", fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.paddingFromBaseline(0.dp, 10.dp))
                Text(text = "Posts")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "842", fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.paddingFromBaseline(0.dp, 10.dp))
                Text(text = "Followers")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "693", fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.paddingFromBaseline(0.dp, 10.dp))
                Text(text = "Following")
            }
        }
        Column(horizontalAlignment = Alignment.Start, modifier = Modifier.padding(20.dp)) {
            Text(text = "Philip", fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.padding(4.dp))
            Text(text = "I like dogs\nand Pipsi Max\nalso ridge soaring")
            Spacer(modifier = Modifier.padding(8.dp))
            Button(
                onClick = { Toast.makeText(context, "Eat pussy", Toast.LENGTH_LONG).show() },
                modifier = Modifier.fillMaxWidth(1f), shape = MaterialTheme.shapes.large
            ) {
                Text(text = "Edit Profile", fontSize = 3.3.em, fontWeight = FontWeight.Bold, color = Color.Black, modifier = Modifier.padding(5.dp))
            }
        }
        Column(horizontalAlignment = Alignment.Start, modifier = Modifier.padding(20.dp)) {
            Row(modifier = Modifier.fillMaxWidth(1f), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceAround) {
                AsyncImage(
                    model = "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/08/39/73/52/ja-ocean-view-hotel.jpg?w=2000&h=-1&s=1",
                    contentDescription = null, modifier = Modifier
                        .fillMaxWidth(1 / 3f)
                        .padding(2.dp))
                AsyncImage(
                    model = "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/27/8e/ba/f9/ja-ocean-view-hotel.jpg?w=1400&h=-1&s=1",
                    contentDescription = null, modifier = Modifier
                        .fillMaxWidth(1 / 2f)
                        .padding(2.dp))
                AsyncImage(
                    model = "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/0a/a7/c4/92/ja-ocean-view-hotel-junior.jpg?w=1100&h=-1&s=1",
                    contentDescription = null, modifier = Modifier
                        .fillMaxWidth(1f)
                        .padding(2.dp))

            }
            Row(modifier = Modifier.fillMaxWidth(1f), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceAround) {
                AsyncImage(
                    model = "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/0a/a7/c7/ae/ja-ocean-view-hotel-sea.jpg?w=1100&h=-1&s=1",
                    contentDescription = null, modifier = Modifier.fillMaxWidth(1/3f).padding(2.dp))
                AsyncImage(
                    model = "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/27/8e/ba/f6/ja-ocean-view-hotel.jpg?w=1400&h=-1&s=1",
                    contentDescription = null, modifier = Modifier.fillMaxWidth(0.5f).padding(2.dp))
                AsyncImage(
                    model = "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/27/8e/ba/f1/ja-ocean-view-hotel.jpg?w=1400&h=-1&s=1",
                    contentDescription = null, modifier = Modifier.fillMaxWidth(1f).padding(2.dp))
                Log.d("!!!","process was done")
            }
        }
    }

}