package com.example.cupcake.data

import kotlinx.coroutines.flow.Flow

interface CupcakeRepository {

    fun getAllOrders(): Flow<List<CupcakeOrder>>

    suspend fun insertOrder(order: CupcakeOrder)
}

class OfflineCupcakeRepository(
    private val dao: CupcakeOrderDao
) : CupcakeRepository {

    override fun getAllOrders(): Flow<List<CupcakeOrder>> {
        return dao.getAll()
    }

    override suspend fun insertOrder(order: CupcakeOrder) {
        dao.insert(order)
    }
}