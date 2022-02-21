package com.example.toyproject016_musicstreaming.service

import retrofit2.Call
import retrofit2.http.GET

interface MusicService {

    @GET("/v3/d4174294-ca98-4a14-9252-b5d82a68d21a")
    fun listMusics() : Call<MusicDto>
}