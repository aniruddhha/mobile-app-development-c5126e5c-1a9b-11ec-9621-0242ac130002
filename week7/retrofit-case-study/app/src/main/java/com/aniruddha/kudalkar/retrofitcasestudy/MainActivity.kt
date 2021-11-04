package com.aniruddha.kudalkar.retrofitcasestudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import com.aniruddha.kudalkar.retrofitcasestudy.composable.GitHubUsers
import com.aniruddha.kudalkar.retrofitcasestudy.domain.GithubUser
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val app = application as CaseStudyApp
        setContent {
            var users : List<GithubUser> by remember { mutableStateOf(listOf()) }

            app.githubApi.users().enqueue( object : Callback<List<GithubUser>> {
                override fun onResponse(
                    call: Call<List<GithubUser>>,
                    response: Response<List<GithubUser>>
                ) {
                    response.body()?.let {
                        users = it
                    }
                }

                override fun onFailure(call: Call<List<GithubUser>>, t: Throwable) {
                }
            } )

            GitHubUsers(users)
        }
    }
}

