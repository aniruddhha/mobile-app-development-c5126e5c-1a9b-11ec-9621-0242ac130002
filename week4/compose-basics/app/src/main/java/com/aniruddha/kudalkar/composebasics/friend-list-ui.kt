package com.aniruddha.kudalkar.composebasics

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class Friend(
    val name : String,
    val mobile : String,
    val handle: String
)

@Composable
internal fun FriendList(friends : List<Friend>) {
    LazyColumn(
        modifier = Modifier.padding(top = 16.dp)
    ) {
        items(friends) { friend ->
            Column(
                modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 8.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Column {
                        Row(verticalAlignment =  Alignment.CenterVertically) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_android),
                                contentDescription = "dp",
                                modifier = Modifier.width(50.dp).height(50.dp)
                            )
                            Text(
                                text = friend.name,
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }

                    Text(
                        text = friend.mobile,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Row {
                    Text(
                        text = friend.handle,
                        fontWeight = FontWeight.Light,
                        color = Color.Gray
                    )
                }
                Divider()
            }
        }
    }
}