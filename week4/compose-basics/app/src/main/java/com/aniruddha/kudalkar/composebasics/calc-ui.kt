package com.aniruddha.kudalkar.composebasics

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
internal fun Calculator() {

    var result by remember { mutableStateOf("") }
    var num1: Int by remember { mutableStateOf(0) }
    var num2: Int by remember { mutableStateOf(0) }

    Column {

        Row {
            Text(text = result)
        }

        Row {
            TextField(
                value =  "$num1",
                onValueChange = { num1 = it.toInt() },
                label = { Text("Number 1") },
                modifier = Modifier.padding(top = 10.dp)
            )
        }
        Row {
            TextField(
                value =  "$num2",
                onValueChange = { num2 = it.toInt() },
                label = { Text("Number 2") },
                modifier = Modifier.padding(top = 10.dp)
            )
        }

        Row {
            Button(onClick = { result = (num1 + num2).toString()  }) {
                Text(text = "Addition")
            }
        }
    }
}