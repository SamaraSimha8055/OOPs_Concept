package com.example.functionssample

/*
class Car(speedConstructor : Int, gearConstructor : Int, seatConstructor : Int) {

    val speed : Int = speedConstructor
    val gear : Int = gearConstructor
    val seat : Int = seatConstructor

    fun speedUp() : Int = speed*5
}*/

class Car(val speed : Int, val gear : Int, val seat : Int) {

    var distance : Int = 0
    fun speedup() = speed*5

    //secondary Constructor...
    constructor(time : Int, speed: Int, gear: Int,seat: Int) : this(speed, gear, seat){
        distance = speed * time
    }
}