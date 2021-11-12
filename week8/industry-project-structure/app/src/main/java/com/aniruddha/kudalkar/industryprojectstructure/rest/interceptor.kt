package com.aniruddha.kudalkar.industryprojectstructure.rest

import okhttp3.Interceptor
import okhttp3.Response

class TrelloInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {

        val request = chain.request()

        val newUrl = request.url()
            .newBuilder()
            .addQueryParameter("key", "")
            .addQueryParameter("token", "")
            .build()

        val newRequest = request.newBuilder()
            .url(newUrl)
            .build()

        return chain.proceed(newRequest)
    }
}