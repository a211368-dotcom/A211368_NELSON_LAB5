package com.example.cupcake.ui

import android.app.Application
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.cupcake.CupcakeApplication

object AppViewModelProvider {
    val Factory = viewModelFactory {
        initializer {
            OrderViewModel(
                cupcakeApplication().container.cupcakeRepository
            )
        }
    }
}

fun CreationExtras.cupcakeApplication(): CupcakeApplication =
    (this[AndroidViewModelFactory.APPLICATION_KEY] as CupcakeApplication)

