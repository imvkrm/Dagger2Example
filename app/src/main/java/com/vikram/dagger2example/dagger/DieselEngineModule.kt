package com.vikram.dagger2example.dagger

import com.vikram.dagger2example.car.DieselEngine
import com.vikram.dagger2example.car.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule constructor(private val horsePower: Int) {

    @Provides
    fun provideHorsePower():Int{
        return horsePower
    }

    @Provides
    fun provideEngine(dieselEngine: DieselEngine): Engine {
        return dieselEngine
    }

}