package com.aniruddha.kudalkar.composebasics

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.text.isDigitsOnly

@Composable
internal fun Calculator() {

    var result by remember { mutableStateOf("") }
    var num1: Int by remember { mutableStateOf(0) }
    var num2: Int by remember { mutableStateOf(0) }

    Column {
        Row(
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth().border(2.dp, Color(0xFF_FF_00_00))
        ) {
            Text(
                text = result,
                style = TextStyle(
                    fontSize = 30.sp
                ),
                modifier = Modifier.padding(16.dp)
            )
        }

        Row {
            TextField(
                value =  "$num1",
                onValueChange = { num1 = if(it.isEmpty() || it.isDigitsOnly().not()) 0 else it.toInt() },
                label = { Text("Number 1") },
                modifier = Modifier.padding(top = 10.dp).fillMaxWidth()
            )
        }
        Row {
            TextField(
                value =  "$num2",
                onValueChange = { num2 = if(it.isEmpty() || it.isDigitsOnly().not()) 0 else it.toInt()  },
                label = { Text("Number 2") },
                modifier = Modifier.padding(top = 10.dp).fillMaxWidth()
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = { result = (num1 + num2).toString()  },
                modifier = Modifier.padding(top = 16.dp)
            ) {
                Text(text = "Addition")
            }
        }
    }
}