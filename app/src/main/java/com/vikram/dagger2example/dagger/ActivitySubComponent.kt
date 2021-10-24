package com.vikram.dagger2example.dagger

import com.vikram.dagger2example.MainActivity
import com.vikram.dagger2example.car.Car
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

//this is a subclass of AppComponent
@PerActivity
@Subcomponent(
    modules = [WheelsModule::class,PetrolEngineModule::class /*DieselEngineModule::class*/]
)
interface ActivitySubComponent {
    val getCar: Car

    fun injection(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder {
        //Assign value run time and can be accessible from anywhere
        @BindsInstance
        fun horsePower(@Named("horse power") horsePower: Int): Builder // If we don't use name we can set only one BindsInstance with int as argument and all int pass as argument will use the same value

        @BindsInstance
        fun engineCapacity(@Named("engine capacity") engineCapacity: Int): Builder

        fun build(): ActivitySubComponent


    }

}