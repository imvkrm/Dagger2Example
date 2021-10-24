package com.vikram.dagger2example.dagger

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {

//This is called Factory Method
    fun getActivitySubComponent(dieselEngineModule: DieselEngineModule): ActivitySubComponent
//pass DieselEngineModule as argument as it's not an abstract class

}