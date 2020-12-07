package com.example.product.data.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.example.product.data.entities.Product

@Dao
interface ProductDao
{
    @Query("SELECT * FROM Product")
    fun getAllData() : LiveData<MutableList<Product>>
}