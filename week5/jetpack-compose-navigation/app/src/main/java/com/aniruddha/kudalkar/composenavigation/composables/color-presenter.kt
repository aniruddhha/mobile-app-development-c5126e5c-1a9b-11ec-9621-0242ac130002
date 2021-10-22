package com.aniruddha.kudalkar.composenavigation.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ColorPresenter(
    red : Float,
    green: Float,
    blue : Float
) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.2f),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "$red", fontSize = 24.sp)
            Text(text = "$green", fontSize = 24.sp)
            Text(text = "$blue", fontSize = 24.sp)
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.8f)
                .padding(16.dp)
                .background(
                    Color(red, green, blue)
                )
        ) {}
    }
}