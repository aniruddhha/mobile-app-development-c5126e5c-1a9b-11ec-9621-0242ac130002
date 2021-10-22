package com.aniruddha.kudalkar.composenavigation.composables

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Switch
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

data class DataItem(
    var from : String,
    var time : String,
    var blb : Boolean
)

@Composable
fun DataList(
    dataItems : List<DataItem>
) {

    LazyColumn {
        items(dataItems) { itm ->
            DataRow(itm)
        }
    }
}

@Composable
fun DataRow(itm : DataItem) {
    Row(
        Modifier
            .height(80.dp)
            .fillMaxWidth()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 16.dp, end = 16.dp)
                .weight(0.5f),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Text(text = itm.from)
            Text(text = itm.time)
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 16.dp, end = 16.dp)
                .weight(0.5f),
            horizontalAlignment = Alignment.End,
            verticalArrangement = Arrangement.Center
        ) {
            Switch(
                checked = false,
                onCheckedChange = {},
            )
        }
    }
    Divider()
}