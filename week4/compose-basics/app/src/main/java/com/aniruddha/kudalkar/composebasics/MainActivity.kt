package com.aniruddha.kudalkar.composebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        val friends = listOf<Friend>(
            Friend("Abc", "9666666", "@abc"),
            Friend("Pqr", "9894313", "@pqr"),
            Friend("Lmn", "6346523748", "@lmn"),
            Friend("Abc", "9666666", "@abc"),
            Friend("Pqr", "9894313", "@pqr"),
            Friend("Lmn", "6346523748", "@lmn"),
            Friend("Abc", "9666666", "@abc"),
            Friend("Pqr", "9894313", "@pqr"),
            Friend("Lmn", "6346523748", "@lmn"),
            Friend("Abc", "9666666", "@abc"),
            Friend("Pqr", "9894313", "@pqr"),
            Friend("Lmn", "6346523748", "@lmn"),
            Friend("Abc", "9666666", "@abc"),
            Friend("Pqr", "9894313", "@pqr"),
            Friend("Lmn", "6346523748", "@lmn"),
            Friend("Abc", "9666666", "@abc"),
            Friend("Pqr", "9894313", "@pqr"),
            Friend("Lmn", "6346523748", "@lmn"),
            Friend("Lmn", "6346523748", "@lmn"),
            Friend("Abc", "9666666", "@abc"),
            Friend("Pqr", "9894313", "@pqr"),
            Friend("Lmn", "6346523748", "@lmn"),
            Friend("Lmn", "6346523748", "@lmn"),
            Friend("Abc", "9666666", "@abc"),
            Friend("Pqr", "9894313", "@pqr"),
            Friend("Lmn", "6346523748", "@lmn"),
            Friend("Lmn", "6346523748", "@lmn"),
            Friend("Abc", "9666666", "@abc"),
            Friend("Pqr", "9894313", "@pqr"),
            Friend("Lmn", "6346523748", "@lmn"),
            Friend("Lmn", "6346523748", "@lmn"),
            Friend("Abc", "9666666", "@abc"),
            Friend("Pqr", "9894313", "@pqr"),
            Friend("Lmn", "6346523748", "@lmn"),
            Friend("Lmn", "6346523748", "@lmn"),
            Friend("Abc", "9666666", "@abc"),
            Friend("Pqr", "9894313", "@pqr"),
            Friend("Lmn", "6346523748", "@lmn")
        )

        setContent {
            FriendList(friends = friends)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppPreView() {
    val friends = listOf<Friend>()

    FriendList(friends = friends)
}
