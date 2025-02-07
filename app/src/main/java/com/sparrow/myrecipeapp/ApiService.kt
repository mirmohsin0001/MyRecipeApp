package com.sparrow.myrecipeapp

import retrofit2.Retrofit
import retrofit2.http.GET

private val retrofit = Retrofit.Builder().baseUrl("https://www.themealdb.com/api/json/v1/1/")
    .addConverterFactory(GsonConverterFactory.Create()).Build()

interface ApiService {
    @GET("categories.php")
    suspend fun getCategories(): CategoriesResponse
}