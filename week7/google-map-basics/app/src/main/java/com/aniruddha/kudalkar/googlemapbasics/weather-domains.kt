package com.aniruddha.kudalkar.googlemapbasics

import com.google.gson.annotations.SerializedName

data class MainResponse (
    @SerializedName("coord") var coordinates : Coord,
    @SerializedName("weather") var weather : List<Weather>,
    @SerializedName("base") var base : String,
    @SerializedName("main") var main : Main,
    @SerializedName("visibility") var visibility : Int,
    @SerializedName("wind") var wind : Wind,
    @SerializedName("clouds") var clouds : Clouds,
    @SerializedName("dt") var dt : Int,
    @SerializedName("sys") var sys : Sys,
    @SerializedName("timezone") var timezone : Int,
    @SerializedName("id") var id : Int,
    @SerializedName("name") var name : String,
    @SerializedName("cod") var cod : Int
)

data class Coord (
    @SerializedName("lon") var lon : Double,
    @SerializedName("lat") var lat : Double
)

data class Weather (
    @SerializedName("id") var id : Int,
    @SerializedName("main") var main : String,
    @SerializedName("description") var description : String,
    @SerializedName("icon") var icon : String
)

data class Main (
    @SerializedName("temp") var temp : Double,
    @SerializedName("feels_like") var feelsLike : Double,
    @SerializedName("temp_min") var tempMin : Double,
    @SerializedName("temp_max") var tempMax : Double,
    @SerializedName("pressure") var pressure : Int,
    @SerializedName("humidity") var humidity : Int
)

data class Wind (
    @SerializedName("speed") var speed : Double,
    @SerializedName("deg") var deg : Int
)

data class Clouds (
    @SerializedName("all") var all : Int
)

data class Sys (
    @SerializedName("type") var type : Int,
    @SerializedName("id") var id : Int,
    @SerializedName("country") var country : String,
    @SerializedName("sunrise") var sunrise : Int,
    @SerializedName("sunset") var sunset : Int
)