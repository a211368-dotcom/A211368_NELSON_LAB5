package com.example.cupcake.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
    interface CupcakeOrderDao {

        @Insert
        suspend fun insert(order: CupcakeOrder)

        @Query("SELECT * FROM cupcake_orders ORDER BY id DESC")
        fun getAll(): Flow<List<CupcakeOrder>>
    }
