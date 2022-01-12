package com.example.proj16_youtube.service

import com.example.proj16_youtube.dto.VideoDto
import retrofit2.Call
import retrofit2.http.GET

interface VideoService {
    @GET("/v3/016cf1a0-5da0-481f-96f1-ff6755f82626")
    fun listVideos(): Call<VideoDto>
}