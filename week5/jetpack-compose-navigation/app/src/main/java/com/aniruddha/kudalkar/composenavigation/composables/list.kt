package com.aniruddha.kudalkar.composenavigation.composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Switch
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

data class DataItem(
    var from: String,
    var time: String,
    var blb: Boolean
)

@Composable
fun DataList(
    dataItems: List<DataItem>,
    navCon: NavHostController
) {
    LazyColumn {
        items(dataItems) { itm ->
            DataRow(itm, navCon)
        }
    }
}

@Composable
fun DataRow(
    itm: DataItem,
    navCon: NavHostController
) {

    var blb by remember { mutableStateOf(false) }

    Row(
        Modifier
            .height(80.dp)
            .fillMaxWidth()
            .clickable { navCon.navigate("bulb/${itm.from}/${blb}") }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 16.dp, end = 16.dp)
                .weight(0.5f),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = itm.from,
                fontSize = 24.sp
            )
            Text(
                text = itm.time,
                color = Color.Gray
            )
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
                checked = blb,
                onCheckedChange = {
                    blb = it
                    itm.blb = blb
                },
            )
        }
    }
    Divider()
}