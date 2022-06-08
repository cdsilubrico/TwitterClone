package com.example.twitterClone.network

import com.example.twitterClone.model.Login
import com.example.twitterClone.model.SignUp
import com.example.twitterClone.model.Tweet
import retrofit2.Call
import retrofit2.http.POST

interface TweetApi {

    @POST("/app/tweet")
    fun tweet(): Call<Tweet>

    @POST("/api/signup")
    fun signup(): Call<SignUp>

    @POST("/api/login")
    fun login(): Call<Login>


}