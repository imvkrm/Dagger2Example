package com.vikram.dagger2example

import android.app.Application
import com.vikram.dagger2example.dagger.AppComponent
import com.vikram.dagger2example.dagger.DaggerAppComponent
import com.vikram.dagger2example.dagger.DriverModule

class Dagger2Application : Application() {

   // private lateinit var activityComponent: ActivityComponent
private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

     /*   *//**
         * For Application-wise Singleton
         * *//*
        //This will create a true singleton as value would not change even if we rotate screen
        activityComponent = DaggerActivityComponent.builder()
            .engineCapacity(1400)
            .horsePower(150)
            .build()*/


       appComponent =DaggerAppComponent.factory().create(DriverModule("Hasan"))
    }


     fun getAppComponentInstance():AppComponent{
        return appComponent
    }
}