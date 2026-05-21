package com.example.cupcake.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [CupcakeOrder::class],
    version = 1,
    exportSchema = false
)
abstract class CupcakeDatabase : RoomDatabase() {

    abstract fun cupcakeOrderDao(): CupcakeOrderDao

    companion object {

        @Volatile
        private var Instance: CupcakeDatabase? = null

        fun getDatabase(context: Context): CupcakeDatabase {

            return Instance ?: synchronized(this) {

                Room.databaseBuilder(
                    context,
                    CupcakeDatabase::class.java,
                    "cupcake_database"
                )
                    .build()
                    .also { Instance = it }
            }
        }
    }
}