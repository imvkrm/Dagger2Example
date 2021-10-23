package com.vikram.dagger2example.dagger

import com.vikram.dagger2example.car.DieselEngine
import com.vikram.dagger2example.car.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {
     //More efficient than provider
    //Binds is used here instead of Provider becoz we don't need any implementation
    // Also while using when interface its a good practice to use Binds
    @Binds
    abstract fun bindEngine(dieselEngine: DieselEngine): Engine

}