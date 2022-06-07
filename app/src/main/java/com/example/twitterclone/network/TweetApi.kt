package com.example.twitterclone.network

import com.example.twitterclone.model.Login
import com.example.twitterclone.model.SignUp
import com.example.twitterclone.model.Tweet
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST

interface TweetApi {

    @POST("/app/tweet")
    fun tweet(): Call<Tweet>

    @POST("/api/signup")
    fun signup(): Call<SignUp>

    @POST("/api/login")
    fun login(): Call<Login>


}