package com.seekar.dagger_hilt_concept.examples.car

import javax.inject.Inject

class Car {

    @Inject     //Constructor Injection
    constructor(wheels: Wheels, engine: Engine) {
    }

    fun drive():String{
       return "Lets Vroom Vroom..."
    }

}