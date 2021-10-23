package com.vikram.dagger2example.car

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor() : Engine {
    private  val TAG = "PetrolEngine"

    override fun start() {
        Log.e(TAG, "PetrolEngine started", )
    }
}