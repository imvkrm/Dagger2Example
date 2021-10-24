package com.vikram.dagger2example.dagger

import com.vikram.dagger2example.MainActivity
import com.vikram.dagger2example.car.Car
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

//this is our excess point
@Singleton
@Component(modules = [WheelsModule::class, PetrolEngineModule::class/*,DieselEngineModule::class*/])
// /*Pet..*/ We can't use both engine module because it would difficult to choose btw them
interface CarComponent {
    val getCar: Car

    fun injection(mainActivity: MainActivity)


    @Component.Builder
    interface Builder {
//Assign value run time and can be accessible from anywhere
        @BindsInstance
        fun horsePower(@Named("horse power") horsePower: Int): Builder // If we don't use name we can set only one BindsInstance with int as argument and all int pass as argument will use the same value

        @BindsInstance
        fun engineCapacity(@Named("engine capacity") engineCapacity: Int): Builder

        fun build(): CarComponent


    }

}