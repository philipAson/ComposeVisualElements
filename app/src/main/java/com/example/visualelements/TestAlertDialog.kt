package com.example.visualelements

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment


/*
        ALERTDIALOG

    * Provide information to the user
    * Get a selection from the user
    * Has a default structure, but is customizable

            AlertDialog(
                onDismissRequest = { openDialog.value = false},
                title = { ... },
                text = { ... },
                confirmButton = {
                    Button(onClick = { ... }) { ... }
                },
                dismissButton = {
                    Button(onClick = { ... }) { ... }
                }
            )
            
 */

@Composable
fun TestAlertDialog() {
    
    val openDialog = remember { mutableStateOf(false) }
    
    Column(
        verticalArrangement = Arrangement.Center, 
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { openDialog.value = true }) {
            Text(text = "open dialog")
            
        }
        
        if (openDialog.value) {
            AlertDialog(onDismissRequest = { openDialog.value = false },
                title = { Text(text = "Hello") },
                text = { Text(text = "how are you?") },
                confirmButton = {
                    Button(onClick = { openDialog.value = false }) {
                        Text(text = "Good")
                    }
                },
                dismissButton = {
                    Button(onClick = { openDialog.value = false }) {
                        Text(text = "bad")
                    }
                }

            )
        }
    }
}