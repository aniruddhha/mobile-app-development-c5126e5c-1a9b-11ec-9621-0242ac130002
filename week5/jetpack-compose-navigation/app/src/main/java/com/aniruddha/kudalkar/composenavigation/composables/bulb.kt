package com.aniruddha.kudalkar.composenavigation.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aniruddha.kudalkar.composenavigation.R


@Composable
fun Bulb(from : String, blb : Boolean) {
    Column(
        modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(16.dp)
    ) {
        Text(
            text = from,
            modifier = Modifier.weight(0.3f).fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 36.sp,
        )
        Image(
            painter = painterResource(id = if(blb) R.drawable.ic_blb_on else R.drawable.ic_blb_off),
            contentDescription = from,
            modifier = Modifier.weight(0.7f).fillMaxWidth(),
        )
    }
}