package com.ozimos.databinding.users.network

import com.ozimos.databinding.users.model.UserModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiEndpoint {

    @GET("users")
    fun getUsers() :Call<List<UserModel>>
}