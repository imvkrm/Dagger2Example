package com.vikram.dagger2example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vikram.dagger2example.car.Car
import com.vikram.dagger2example.dagger.DaggerActivityComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car1: Car

    @Inject
    lateinit var car2: Car   //Field Injection

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /**
         * For Activity-wise Singleton
         * */
        /* val carComponent = DaggerCarComponent.builder()
             .horsePower(150)
             .engineCapacity(1400)
             //.dieselEngineModule(DieselEngineModule(123))
             .build()
         // car=carComponent.getCar  //Constructor Injection
         carComponent.injection(this)  //Field Injection*/

        /*   */
        /**
         * For Application-wise Singleton
         * *//*
        val carComponent=(applicationContext as Dagger2Application).getCarComponentInstance()
    carComponent.injection(this)
      */


        val activityComponent = DaggerActivityComponent.builder()
            .engineCapacity(1400)
            .horsePower(150)
            .appComponent((applicationContext as Dagger2Application).getAppComponentInstance())
            .build()

        activityComponent.injection(this)
        car1.drive()
        car2.drive()
    }
}

