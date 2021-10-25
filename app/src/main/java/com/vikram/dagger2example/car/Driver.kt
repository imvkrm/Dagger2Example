package com.vikram.dagger2example.car

/*@Singleton  // the AppComponent should also be singleton
//Singleton becoz one driver can drive multiple cars*/


class Driver  constructor(val name:String) {
    //Assuming -We don't own this class so we cann'' annotate it with @Inject
}