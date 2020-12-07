package com.example.product.data.entities

import androidx.room.Entity

@Entity(tableName = "Product", primaryKeys = ["productName"])
data class Product(
        var productName:String,
        var price:String?,
        var qty:String?,
        var productImg:String?
                  )