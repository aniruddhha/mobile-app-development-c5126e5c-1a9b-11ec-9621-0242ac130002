package com.aniruddha.kudalkar.composebasics

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class Demos {
    companion object {

        @Composable
        fun SimpleText() {
            Text(text = "Welcome To Jetpack Compose")
        }

        @Composable
        fun RowsColumns() {
            Column {
                Row {
                    Image(
                        painter = painterResource(R.drawable.ic_android),
                        contentDescription = "Android Icons"
                    )
                    Text(
                        text = "Hello World"
                    )
                }
                Text(text = "This is detailed")
            }
        }

        @Composable
        fun ModifierDemo() {
            Text(
                text = "Hello",

                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .padding(10.dp)
//                    .fillMaxWidth()
//                    .fillMaxHeight()
                    .border(2.dp, Color.Black)
            )
        }
    }
}

