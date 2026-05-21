package com.example.cupcake.data

import android.content.Context

interface AppContainer {
    val cupcakeRepository: CupcakeRepository
}

class AppDataContainer(
    private val context: Context
) : AppContainer {

    override val cupcakeRepository: CupcakeRepository by lazy {

        OfflineCupcakeRepository(
            CupcakeDatabase.getDatabase(context).cupcakeOrderDao()
        )
    }
}
