package com.example.visualelements

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage


@Composable
fun ExerciseBuildThisLayoutSolution() {

    Column {
        val profileImg = painterResource(id = R.drawable.me_munin_quinn)

        //HEADER
        Row(modifier = Modifier
            .fillMaxWidth(1f)
            .height(150.dp)
            .padding(8.dp)
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(painter = profileImg,
                    contentDescription = null,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop

                )
            }
            Column(modifier = Modifier
                .weight(1f)
                .fillMaxHeight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "123", fontWeight = FontWeight.Bold)
                Text(text = stringResource(id = R.string.posts))
            }
            
            Column(modifier = Modifier
                .weight(1f)
                .fillMaxHeight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "1234", fontWeight = FontWeight.Bold)
                Text(text = stringResource(id = R.string.followers))
            }
            
            Column(modifier = Modifier
                .weight(1f)
                .fillMaxHeight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "12332", fontWeight = FontWeight.Bold)
                Text(text = stringResource(id = R.string.following))
            }
            
        }

        //INFO
        Column(modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(1f)
        ) {
            Text(text = stringResource(id = R.string.user_name), fontWeight = FontWeight.Bold)
            Text(text = stringResource(id = R.string.ig_profile_description))
        }

        //BUTTON
        Row(modifier = Modifier.padding(8.dp)
        ) {
            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.LightGray),
                shape = RoundedCornerShape(4.dp),
                modifier = Modifier.fillMaxWidth(1f)
                ) {
                Text(text = stringResource(id = R.string.ig_profile_button),
                modifier = Modifier
                    .padding(8.dp))

            }
        }
        
        //POSTS
        Column {
            Row(modifier = Modifier.fillMaxWidth(1f)) {
                AsyncImage(model = "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/08/39/73/52/ja-ocean-view-hotel.jpg?w=2000&h=-1&s=1", contentDescription = null,
                modifier = Modifier.weight(1f).aspectRatio(1f).padding(end = 1.dp, bottom = 1.dp),
                contentScale = ContentScale.Crop)
                AsyncImage(model = "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/08/39/73/52/ja-ocean-view-hotel.jpg?w=2000&h=-1&s=1", contentDescription = null,
                modifier = Modifier.weight(1f).aspectRatio(1f).padding(end = 1.dp, bottom = 1.dp),
                    contentScale = ContentScale.Crop)
                AsyncImage(model = "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/08/39/73/52/ja-ocean-view-hotel.jpg?w=2000&h=-1&s=1", contentDescription = null,
                modifier = Modifier.weight(1f).aspectRatio(1f).padding(bottom = 1.dp),
                    contentScale = ContentScale.Crop)

            }
            Row(modifier = Modifier.fillMaxWidth(1f)) {
                AsyncImage(model = "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/08/39/73/52/ja-ocean-view-hotel.jpg?w=2000&h=-1&s=1", contentDescription = null,
                modifier = Modifier.weight(1f).aspectRatio(1f).padding(end = 1.dp, bottom = 1.dp),
                    contentScale = ContentScale.Crop)
                AsyncImage(model = "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/08/39/73/52/ja-ocean-view-hotel.jpg?w=2000&h=-1&s=1", contentDescription = null,
                modifier = Modifier.weight(1f).aspectRatio(1f).padding(end = 1.dp, bottom = 1.dp),
                    contentScale = ContentScale.Crop)
                AsyncImage(model = "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/08/39/73/52/ja-ocean-view-hotel.jpg?w=2000&h=-1&s=1", contentDescription = null,
                modifier = Modifier.weight(1f).aspectRatio(1f).padding(bottom = 1.dp))

            }

        }

    }
}