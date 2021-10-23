package com.vikram.dagger2example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vikram.dagger2example.car.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
   @Inject lateinit var car: Car   //Field Injection

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent=DaggerCarComponent.create()
       // car=carComponent.getCar  //Constructor Injection
        carComponent.injection(this)  //Field Injection

        car.drive()
    }
}

