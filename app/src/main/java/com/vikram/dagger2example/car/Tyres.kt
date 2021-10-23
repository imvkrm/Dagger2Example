package com.vikram.dagger2example.car

import android.util.Log

class Tyres {
    //Assuming -We don't own this class so we cann'' annotate it with @Inject

    private val TAG = "Tyres"
    fun inflate() {
        Log.e(TAG, "inflate tyres")
    }

}