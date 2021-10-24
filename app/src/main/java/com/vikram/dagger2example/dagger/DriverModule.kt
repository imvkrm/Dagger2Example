package com.vikram.dagger2example.dagger

import com.vikram.dagger2example.car.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class DriverModule {
    companion object {
        @Provides
        @Singleton
        fun provideDriver(): Driver {
            return Driver()
        }
    }
}