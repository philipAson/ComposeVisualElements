package com.example.visualelements

import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun LazyListTest() {
    /*
    LazyLists

    * Memory issues with loading all elements at once
    * Load only elements that are visible
    * Display a large number of items
    * Varying number of total elements

    LazyColumn:

            item { Text(text = "") }
            items(names) { Text(text = it) }
            items(10) { Text(text = it) }
    */

//    val names = listOf<String>("anna", "bob", "carol", "philip", "bibi")
//    LazyColumn{
//        item { Text(text = "header of the list", modifier = Modifier.height(100.dp))}
//        items(names) {
//            Text(text = "User: $it", modifier = Modifier.height(100.dp))
//            Divider()
//        }
//        items(10) { Text(text = "user number :$it", modifier = Modifier.height(100.dp))}
//    }

//    LazyRow{
//        item { Text(text = "header of the list", modifier = Modifier.height(100.dp))}
//        items(names) {
//            Text(text = "User: $it", modifier = Modifier.height(100.dp))
//            Divider()
//        }
//        items(10) { Text(text = "user number :$it", modifier = Modifier.height(100.dp))}
//    }

    val imgUrlList = listOf(
        "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/08/39/73/52/ja-ocean-view-hotel.jpg?w=2000&h=-1&s=1",
        "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/27/8e/ba/f9/ja-ocean-view-hotel.jpg?w=1400&h=-1&s=1",
        "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/0a/a7/c4/92/ja-ocean-view-hotel-junior.jpg?w=1100&h=-1&s=1",
        "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/0a/a7/c7/ae/ja-ocean-view-hotel-sea.jpg?w=1100&h=-1&s=1",
        "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/27/8e/ba/f6/ja-ocean-view-hotel.jpg?w=1400&h=-1&s=1",
        "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/27/8e/ba/f1/ja-ocean-view-hotel.jpg?w=1400&h=-1&s=1",
        )

    val gridImages = arrayListOf<String>()

    for (i in 0..100) {
        gridImages.add(imgUrlList.random())

    }

    LazyVerticalGrid(columns = GridCells.Adaptive(100.dp)) {
        items(gridImages) {
            AsyncImage(model = it, contentDescription = null,

                // Get em nice n SQUARE (cropped without deforming)
            modifier = Modifier.aspectRatio(1f),
            contentScale = ContentScale.Crop)
        }
    }

}