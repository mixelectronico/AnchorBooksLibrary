package com.example.anchorbooks

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.anchorbooks.model.Repository
import kotlinx.coroutines.launch

class BookViewModel : ViewModel() {

    private val repository = Repository()

    fun getBooksFromLibrary() {
        viewModelScope.launch {
            repository.getCountries()
        }
    }

}