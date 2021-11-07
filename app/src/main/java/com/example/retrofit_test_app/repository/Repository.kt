package com.example.retrofit_test_app.repository

import com.example.retrofit_test_app.api.RetrofitInstance
import com.example.retrofit_test_app.model.Post
import okhttp3.Response

class Repository {
    suspend fun getPost() : retrofit2.Response<Post> {
        return RetrofitInstance.api.getPost()
    }

    suspend fun getPost2(number:Int): retrofit2.Response<Post> {
        return RetrofitInstance.api.getPost2(number)
    }
}