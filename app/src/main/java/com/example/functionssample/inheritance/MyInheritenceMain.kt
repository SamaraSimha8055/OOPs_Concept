package com.example.functionssample.inheritance

fun main(){

    val car = Car(4)

    println("Some inherited properties will be doors : ${car.doors} and speed : ${car.speed} to car")
    println("Some inherited properties will be move : ${car.move()} and stop : ${car.stop()} to car")

    val truck = Truck(1000)

    println("Some inherited properties will be doors : ${truck.doors} and speed : ${truck.speed} to truck")
    println("Some inherited properties will be move : ${truck.move()} and speeding up : ${truck.speedUp()} to truck")


}