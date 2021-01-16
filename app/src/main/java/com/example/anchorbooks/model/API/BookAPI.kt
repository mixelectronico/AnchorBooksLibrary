package com.example.anchorbooks.model.API

import com.example.anchorbooks.model.pojo.BookDetail
import com.example.anchorbooks.model.pojo.Library
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface BookAPI {

    @GET("books")
    suspend fun getCountries(): Response<List<Library>>

    @GET("bookDetail/{id}")
    suspend fun getCountry(@Path("id") id : Int): Response<BookDetail>
}