package com.example.functionssample.visibilitymodifiers

class C : A() {

    //child of Class A...
    //Protected from A to B...

    fun accessClassA(){

        println("Property class A is : $propertyA")
        functionA()

    }
}