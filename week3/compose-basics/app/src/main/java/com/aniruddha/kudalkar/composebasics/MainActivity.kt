package com.aniruddha.kudalkar.composebasics

import android.os.Bundle
import android.widget.DatePicker
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import com.aniruddha.kudalkar.composebasics.ui.theme.ComposeBasicsTheme
import com.google.android.material.datepicker.MaterialDatePicker

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text(
                text = "Hello, Android!",
                color = Color.Red,
                fontSize = TextUnit.Unspecified,
                letterSpacing = TextUnit.Unspecified,
                overflow = TextOverflow.Clip
            )
        }
    }
}

@Composable
fun Greeting(name: String) {
    MaterialDatePicker.Builder.datePicker().build()
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeBasicsTheme {
        Greeting("Android")
    }
}