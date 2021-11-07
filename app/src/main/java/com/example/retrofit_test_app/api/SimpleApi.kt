package com.example.retrofit_test_app.api

import com.example.retrofit_test_app.model.Post
import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface SimpleApi {
    @GET("posts/1")
    suspend fun getPost(): retrofit2.Response<Post>

    @GET("posts/{postNumber}")
    suspend fun getPost2(
        @Path("postNumber") number: Int
    ): retrofit2.Response<Post>
}