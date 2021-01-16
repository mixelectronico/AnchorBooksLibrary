package com.example.anchorbooks.model

import com.example.anchorbooks.model.API.RetrofitClient
import timber.log.Timber

class Repository {

    suspend fun getCountries() {
        Timber.d("getCountries")
        val response = RetrofitClient.retrofitInstance().getCountries()

        if(response.isSuccessful) {
            response.body()?.let {
                Timber.d("Tenemos ${it} libros")
            }
        } else {
            Timber.d("${response.errorBody()}")
        }
    }

}