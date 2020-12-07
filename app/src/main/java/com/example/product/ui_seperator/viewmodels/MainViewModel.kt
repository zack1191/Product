package com.example.product.ui_seperator.viewmodels

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.product.data.entities.Product
import com.example.product.ui_seperator.repositories.MainRepository
import javax.inject.Inject

class MainViewModel @ViewModelInject constructor(private val mainRepository : MainRepository, @Assisted val savedStateHandle : SavedStateHandle) : ViewModel()
{
    val getAllData : LiveData<MutableList<Product>> = mainRepository.getAllData
}