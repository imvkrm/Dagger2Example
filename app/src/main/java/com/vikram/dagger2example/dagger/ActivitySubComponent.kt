package com.vikram.dagger2example.dagger

import com.vikram.dagger2example.MainActivity
import com.vikram.dagger2example.car.Car
import dagger.Subcomponent

//this is a subclass of AppComponent
@PerActivity
@Subcomponent(
    modules = [WheelsModule::class, DieselEngineModule::class]
)
interface ActivitySubComponent {
    val getCar: Car

    fun injection(mainActivity: MainActivity)


}