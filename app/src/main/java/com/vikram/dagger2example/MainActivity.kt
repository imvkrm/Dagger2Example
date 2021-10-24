package com.vikram.dagger2example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vikram.dagger2example.car.Car
import com.vikram.dagger2example.dagger.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car1: Car
    @Inject
    lateinit var car2: Car   //Field Injection

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = DaggerCarComponent.builder()
            .horsePower(150)
            .engineCapacity(1400)
            //.dieselEngineModule(DieselEngineModule(123))
            .build()
        // car=carComponent.getCar  //Constructor Injection
        carComponent.injection(this)  //Field Injection

        car1.drive()
        car2.drive()
    }
}

