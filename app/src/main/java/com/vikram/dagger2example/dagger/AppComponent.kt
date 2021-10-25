package com.vikram.dagger2example.dagger

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {

//This is called Factory Method
    fun getActivitySubComponentFactory(): ActivitySubComponent.Factory
//pass DieselEngineModule as argument as it's not an abstract class

    @Component.Factory
    interface Factory{
        fun create(driverModule: DriverModule):AppComponent
    }

}