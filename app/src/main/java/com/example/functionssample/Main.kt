package com.example.functionssample

fun main(){

    //primary Constructors...
    val car1 = Car(50, 4, 2)

    //instance of classes...
    println("car1 speed is : ${car1.speed}, gear is : ${car1.gear}, seat is :${car1.seat}")

    println("car1 speed after speeding up is ${car1.speedup()}")

    //secondary Constructors...
    val car2 = Car(5, 50, 5, 4)

    println("Distance cross by speed ${car2.speed} will be ${car2.distance}")
}