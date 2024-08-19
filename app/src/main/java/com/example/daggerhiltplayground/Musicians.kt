package com.example.daggerhiltplayground

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Musicians {
    //constructor injection
    @Inject
    constructor(instrument: Instrument,band: Band){
        fun sing() {
            println("It's singing")
        }
    }
}