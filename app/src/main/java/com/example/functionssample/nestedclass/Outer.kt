package com.example.functionssample.nestedclass

class Outer {

    var a : Int = 10

    inner class Nested{

        fun nestedFunction(){

            println("I am inside nested class $a")
        }
    }
}