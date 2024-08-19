package com.example.daggerhiltplayground

import javax.inject.Inject

class InterfaceImplamentor
    @Inject constructor() : MyInterface {
    override fun myPrintFunction(): String {
        return "InterfaceImplamentor"
    }
}