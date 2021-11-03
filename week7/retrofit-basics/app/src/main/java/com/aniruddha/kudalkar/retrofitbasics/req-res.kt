package com.aniruddha.kudalkar.retrofitbasics

import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

data class ReqResSupport(
    var url : String,
    var text : String
)

data class ReqResUser(
    var id : Int,
    var email  : String,
    var first_name : String,
    var last_name : String,
    var avatar : String
)

data class ReqResMain(
    var page : Int,
    var per_page : Int,
    var total : Int,
    var total_pages:Int,
    var data : Array<ReqResUser>,
    var support : ReqResSupport
)

interface ReqResApi {
    @GET("api/users")
    fun users() : Call<ReqResMain>
}

fun initRetrofit() {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://reqres.in/")
        .addConverterFactory(GsonConverterFactory.create())
        .build();

    val reqRes = retrofit.create(ReqResApi::class.java)

    val scp = CoroutineScope(Dispatchers.IO)
    scp.launch {
        val res = reqRes.users().execute()
        Log.i("@ani", res.body().toString())
    }
}