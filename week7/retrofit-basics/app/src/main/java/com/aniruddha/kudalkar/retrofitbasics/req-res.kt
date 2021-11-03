package com.aniruddha.kudalkar.retrofitbasics

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ReqResApi {
    @GET("api/users")
    fun users() : Call<ReqResMain>

    fun save(@Body user : RegUser): Call<RegResponse>
}

