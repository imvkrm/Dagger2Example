package com.vikram.dagger2example.car

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor(private val horsePower:Int) : Engine {
    private  val TAG = "DieselEngine"

    override fun start() {
        Log.e(TAG, "DieselEngine started HorsePower: $horsePower", )
    }

}