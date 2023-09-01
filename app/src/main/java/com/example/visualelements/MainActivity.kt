package com.example.visualelements

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.visualelements.ui.theme.VisualElementsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VisualElementsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    TestModifiers()
//                    TestLayout()
//                    TestSizing()
//                    ExerciseLayout()
//                    ExLayoutTemp()
//                    TestText()
//                    TestTheme()
//                    TestImages()
//                    TestButtons()
                    ExerciseBuildThisLayout()

                    val context = LocalContext.current
//                    Toast.makeText(context, "hey hows it going?", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}