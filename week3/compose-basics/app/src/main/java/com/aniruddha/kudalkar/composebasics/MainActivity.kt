package com.aniruddha.kudalkar.composebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.End
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aniruddha.kudalkar.composebasics.ui.theme.ComposeBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChatScreen()
        }
    }
}

@Composable
fun ChatScreen() {

    var text by remember { mutableStateOf("") }

    Column {
        Row(modifier = Modifier.weight(9f)) {
            LazyColumn(Modifier.fillMaxWidth()) {
                items(5) { index ->
                    Column(Modifier.fillMaxWidth()) {
                        Row(
                            horizontalArrangement = Arrangement.End,
                            modifier = Modifier.padding(start=50.dp)
                        ) {
                            Text(
                                modifier = Modifier.wrapContentWidth()
                                    .background(Color(0xFFFF0000)),
                                textAlign = TextAlign.Right,
                                text = "Using Compose, you can build your user interface by defining a set of composable functions that take in data and emit UI elements. A simple example is a Greeting widget, which takes in a String and emits a Text widget which displays a greeting message."
                            )
                        }
                        Row {
                            Text("User")
                            Text("Time")
                        }
                    }
                }
            }
        }
        Row(modifier = Modifier.weight(1f)) {
           TextField(
               value = text,
               onValueChange = { text = it },
               modifier = Modifier
                   .weight(8f)
                   .fillMaxHeight()
           )
           Button(
               onClick = {  },
               modifier = Modifier
                   .weight(2f)
                   .fillMaxHeight()
           ) {
                Text(text = "Send")
           }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeBasicsTheme {
        ChatScreen()
    }
}