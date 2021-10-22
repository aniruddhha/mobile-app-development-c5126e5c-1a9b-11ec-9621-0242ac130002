package com.aniruddha.kudalkar.composenavigation.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.aniruddha.kudalkar.composenavigation.R


@Composable
fun Bulb(from : String, blb : Boolean) {
    Column {
        Text(text = from)
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = from
        )
    }
}