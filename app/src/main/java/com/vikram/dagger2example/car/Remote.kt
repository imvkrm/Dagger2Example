package com.vikram.dagger2example.car

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {
    private  val TAG = "Remote"
    fun setListener(car: Car){
        Log.e(TAG, "Remote Connected")

    }
}