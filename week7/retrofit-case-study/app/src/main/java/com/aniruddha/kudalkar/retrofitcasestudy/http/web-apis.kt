package com.aniruddha.kudalkar.retrofitcasestudy.http

import com.aniruddha.kudalkar.retrofitcasestudy.domain.MainResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("data/2.5/weather/")
    fun weatherOfCity(
        @Query("q") q : String,
        @Query("appid") appid : String = "e8adb83af69d087ce7ce7fdb6c975566"
    ) : Call<MainResponse>
}