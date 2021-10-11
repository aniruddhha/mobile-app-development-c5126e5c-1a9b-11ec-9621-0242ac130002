package com.aniruddha.kudalkar.composebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.ui.res.painterResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContent {
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
    }
}
