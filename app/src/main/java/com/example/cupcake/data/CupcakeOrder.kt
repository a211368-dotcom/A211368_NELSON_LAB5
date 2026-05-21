package com.example.cupcake.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cupcake_orders")
data class CupcakeOrder(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val quantity: Int,
    val flavor: String,
    val pickupDate: String,
    val price: String
)