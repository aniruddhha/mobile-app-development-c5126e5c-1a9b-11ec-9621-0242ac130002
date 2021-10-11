package com.aniruddha.kudalkar.composebasics

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class InputDemo {
    companion object {

        @Composable
        fun NormalInput() {
            TextField(
                value = "",
                onValueChange = {  },
                label = { Text("Label") },
                modifier = Modifier.padding(top = 10.dp)
            )
        }
    }
}
