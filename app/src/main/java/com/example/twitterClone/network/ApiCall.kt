package com.example.twitterClone.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiCall {

    private const val BASE_URL = "http://localhost:8080/api/"

    val tweeterApi: TweetApi by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(TweetApi::class.java)
    }

}