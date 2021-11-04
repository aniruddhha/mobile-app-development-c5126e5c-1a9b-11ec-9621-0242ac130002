package com.aniruddha.kudalkar.retrofitcasestudy.composable

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.aniruddha.kudalkar.retrofitcasestudy.domain.GithubUser
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun GitHubUsers(
    users : List<GithubUser>
) {
    LazyColumn {
        items(users) { user ->
            GitUserRow(user = user)
        }
    }
}

@Composable
fun GitUserRow(user : GithubUser) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(80.dp)
    ) {
        Text(text = user.login)
    }
}