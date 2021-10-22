package com.aniruddha.kudalkar.composenavigation.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Switch
import androidx.compose.material.Text

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
    Row() {
        Column() {
            Text(text = itm.from)
            Text(text = itm.time)
        }
        Column() {
            Switch(checked = false, onCheckedChange = {})
        }
    }
}