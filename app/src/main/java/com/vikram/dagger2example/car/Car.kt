package com.vikram.dagger2example.car

import android.util.Log
import com.vikram.dagger2example.dagger.PerActivity
import javax.inject.Inject

//Constructor Injection
@PerActivity
class Car @Inject constructor(private val engine: Engine,private val wheels: Wheels,private val driver: Driver) {

    private val TAG = "Car"
    //Field Injection
   @Inject lateinit var sheets: Sheets // This will be automatically called by dagger after Constructor Injection

   //In case there is a Constructor Injection then we need not to call method in Component and pass instance, it will be taken care by dagger

    //Method Injection
    @Inject
    fun enableRemote(remote: Remote) {// This will be automatically called by dagger after Field Injection
        remote.setListener(this)
    }

    fun drive() {
        engine.start()
        Log.e(TAG, "$driver ${driver.name} drives $this")
    }
}