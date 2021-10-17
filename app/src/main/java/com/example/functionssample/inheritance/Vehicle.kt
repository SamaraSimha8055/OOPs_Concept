package com.example.functionssample.inheritance

open class Vehicle(val speed : Int = 10, val wheels : Int = 4, val doors : Int = 4, val driverName : String = "Sam") {

    fun move() = speed*5
    fun stop() = 0
    fun speedUp() = speed*10
}