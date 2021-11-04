package com.aniruddha.kudalkar.googlemapbasics

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("data/2.5/weather/")
    fun weatherOfCity(
        @Query("q") q : String,
        @Query("appid") appid : String = "42cdfd5c0252c59f1a7f37092908f599"
    ) : Call<MainResponse>
}
