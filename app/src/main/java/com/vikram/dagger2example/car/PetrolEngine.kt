package com.vikram.dagger2example.car

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(@Named("horse power") private val horsePower:Int, @Named("engine capacity") private val engineCapacity:Int) : Engine {
    private  val TAG = "PetrolEngine"


    override fun start() {
        Log.e(TAG, "PetrolEngine started " +
                "\nhorsePower: $horsePower " +
                "\nengineCapacity: $engineCapacity")
    }
}