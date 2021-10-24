package com.vikram.dagger2example.dagger

import javax.inject.Scope

@Scope
@MustBeDocumented
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class PerActivity() //Activity wise scope
