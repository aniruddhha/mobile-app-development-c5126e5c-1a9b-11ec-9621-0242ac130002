package com.aniruddha.kudalkar.retrofitcasestudy

import android.app.Application
import com.aniruddha.kudalkar.retrofitcasestudy.http.GithubApi
import com.aniruddha.kudalkar.retrofitcasestudy.http.WeatherApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CaseStudyApp : Application() {

    private val retrofit : Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.openweathermap.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val weatherApi : WeatherApi by lazy {
        retrofit.create(WeatherApi::class.java)
    }

    private val retrofitGithub : Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val githubApi : GithubApi by lazy {
        retrofitGithub.create(GithubApi::class.java)
    }
}