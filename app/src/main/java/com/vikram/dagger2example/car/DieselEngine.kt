package com.vikram.dagger2example.car

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor() : Engine {
    private  val TAG = "DieselEngine"

    override fun start() {
        Log.e(TAG, "DieselEngine started", )
    }

}