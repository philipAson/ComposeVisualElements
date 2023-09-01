package com.example.visualelements

import android.provider.ContactsContract.CommonDataKinds.Im
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

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
            Button(onClick = {}, enabled = false, shape = CircleShape) {
                Image(painter = imageResource, contentDescription = null, modifier = Modifier.fillMaxWidth(0.2f))
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "21", fontWeight = FontWeight.Bold)
                Text(text = "Posts")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "21", fontWeight = FontWeight.Bold)
                Text(text = "Posts")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "21", fontWeight = FontWeight.Bold)
                Text(text = "Posts")
            }
        }
        Column(horizontalAlignment = Alignment.Start, modifier = Modifier.padding(20.dp)) {
            Text(text = "Philip", fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.padding(4.dp))
            Text(text = "I like pussy\nand Pipsi Max\nalso ridge soaring")
            Spacer(modifier = Modifier.padding(8.dp))
            Button(
                onClick = { Toast.makeText(context, "Eat pussy", Toast.LENGTH_LONG).show() },
                modifier = Modifier.fillMaxWidth(1f), shape = MaterialTheme.shapes.large
            ) {
                Text(text = "Edit Profile", fontWeight = FontWeight.Bold, color = Color.Black, modifier = Modifier.padding(5.dp))
            }
        }
    }

}