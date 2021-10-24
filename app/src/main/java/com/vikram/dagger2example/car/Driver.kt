package com.vikram.dagger2example.car

import javax.inject.Inject
import javax.inject.Singleton

@Singleton  // the CarComponent should also be singleton
//Singleton becoz one driver can drive multiple cars
class Driver @Inject constructor() {
}