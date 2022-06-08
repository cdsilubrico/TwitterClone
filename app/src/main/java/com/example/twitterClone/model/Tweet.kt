package com.example.twitterClone.model

data class Tweet(
    val favorite: Boolean,
    val favoriteCount: Int,
    val inReplyToStatusId: Int,
    val inReplyToUserId: Int,
    val replyCount: Int,
    val retweetCount: Int,
    val retweeted: Boolean,
    val text: String
)