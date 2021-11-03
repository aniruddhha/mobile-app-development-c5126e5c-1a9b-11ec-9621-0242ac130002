package com.aniruddha.kudalkar.retrofitbasics

import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

internal fun initRetrofit() {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://reqres.in/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val reqRes = retrofit.create(ReqResApi::class.java)

    val scp = CoroutineScope(Dispatchers.IO)
    scp.launch {
        val res = reqRes.users().execute()
        Log.i("@ani Sync", res.body().toString())

        reqRes.users().enqueue(object : Callback<ReqResMain> {
            override fun onResponse(call: Call<ReqResMain>, response: Response<ReqResMain>) {
                Log.i("@ani Async", response.body().toString())
            }

            override fun onFailure(call: Call<ReqResMain>, t: Throwable) {
            }
        })
    }
}