package com.vikram.dagger2example.dagger

import com.vikram.dagger2example.car.Rims
import com.vikram.dagger2example.car.Tyres
import com.vikram.dagger2example.car.Wheels
import dagger.Module
import dagger.Provides

@Module
abstract class WheelsModule {
//abstract becoz we don'' need implementation of any of below methods so these methods can be of static type

    @Provides
    fun provideRims(): Rims {
        return Rims()
    }

    @Provides
    fun provideTyres(): Tyres {
        val tyres= Tyres()
        tyres.inflate()
        return tyres
    }

    @Provides
    fun provideWheels(rims: Rims, tyres: Tyres): Wheels {
        return Wheels(rims,tyres)
    }

}