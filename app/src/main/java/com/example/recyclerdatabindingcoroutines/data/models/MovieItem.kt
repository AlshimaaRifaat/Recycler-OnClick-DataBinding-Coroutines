package com.example.recyclerdatabindingcoroutines.data.models


import com.google.gson.annotations.SerializedName

data class MovieItem(
    @SerializedName("id")
    var id: Int,
    @SerializedName("image")
    var image: String,
    @SerializedName("is_new")
    var isNew: Int?,
    @SerializedName("language")
    var language: String,
    @SerializedName("like_percent")
    var likePercent: Int,
    @SerializedName("rating")
    var rating: String,
    @SerializedName("title")
    var title: String,
    @SerializedName("type")
    var type: String,
    @SerializedName("vote_count")
    var voteCount: Int
)