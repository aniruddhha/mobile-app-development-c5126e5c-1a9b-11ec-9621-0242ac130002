package com.aniruddha.kudalkar.retrofitbasics

import android.app.Application
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ReqResApp : Application() {

    private val retrofit : Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://reqres.in/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val reqResApi: ReqResApi by lazy {
       retrofit.create(ReqResApi::class.java)
    }
}