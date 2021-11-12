package com.aniruddha.kudalkar.industryprojectstructure.rest

import okhttp3.Interceptor
import okhttp3.Response

class TrelloInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {

        var request = chain.request()

        val url = request.url()
            .newBuilder()
            .addQueryParameter("key", "")
            .addQueryParameter("token", "")
            .build()
        request = request.newBuilder().url(url).build()
        return chain.proceed(request)
    }
}