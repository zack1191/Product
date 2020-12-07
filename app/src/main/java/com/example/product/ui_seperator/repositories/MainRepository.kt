package com.example.product.ui_seperator.repositories

import androidx.lifecycle.LiveData
import com.example.product.data.daos.ProductDao
import com.example.product.data.entities.Product
import javax.inject.Inject

class MainRepository @Inject constructor(private val productDao : ProductDao)
{
val getAllData:LiveData<MutableList<Product>> = productDao.getAllData()
}