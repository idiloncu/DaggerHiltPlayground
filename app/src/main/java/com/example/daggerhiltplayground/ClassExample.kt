package com.example.daggerhiltplayground

import javax.inject.Inject

class ClassExample {
    @Inject
    constructor(myInterfaceImplementor: MyInterface){
        fun myFunction() : String{
           return "working: ${myInterfaceImplementor.myPrintFunction()}"
        }
    }
}