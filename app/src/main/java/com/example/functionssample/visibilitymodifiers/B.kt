package com.example.functionssample.visibilitymodifiers

open class B {

    //A to B...
    //Make public to workout...

    fun accessClassAFromB(){

        val instanceA = A()
        println("Property class A is : ${instanceA.propertyA}")
        instanceA.functionA()

    }
}