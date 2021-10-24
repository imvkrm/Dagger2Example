package com.vikram.dagger2example.dagger

import com.vikram.dagger2example.car.Driver
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {
    fun getDriver():Driver
}