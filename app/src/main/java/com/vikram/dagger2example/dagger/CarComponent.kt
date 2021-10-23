package com.vikram.dagger2example.dagger

import com.vikram.dagger2example.MainActivity
import com.vikram.dagger2example.car.Car
import dagger.Component

//this is our excess point
@Component (modules = [WheelsModule::class, /*PetrolEngineModule::class,*/DieselEngineModule::class])
// /*Pet..*/ We can't use both engine module because it would difficult to choose btw them
interface CarComponent {
    val getCar: Car

    fun injection(mainActivity: MainActivity)

}