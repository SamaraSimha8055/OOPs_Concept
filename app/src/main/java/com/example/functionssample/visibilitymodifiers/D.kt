package com.example.functionssample.visibilitymodifiers

class D : B() {

    //child of class B...

    fun accessAFromD(){

        val instanceA = A()
        println("Property class A is : ${instanceA.propertyA}")
        instanceA.functionA()

    }
}