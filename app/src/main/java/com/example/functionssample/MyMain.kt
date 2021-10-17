package com.example.functionssample

fun main(){
    println("I am inside the function")

    myFirst()
    mySecond()

    val day = dayOfWeek()
    println("My favorite day of week is $day")

    val number1 = 5
    val number2 = 10
    val result = sum(number1,number2)
    println("The sum of $number1 and $number2 is : $result")
    }

fun myFirst(){
    println("I am inside myFirstSimpleFunction")
}

fun mySecond(){
    for (i in 1..10){
        println("number = $i")
    }
}

fun dayOfWeek(): String {
    val arrOfDays =
        arrayOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")

    //return type function
    return arrOfDays[(0..6).random()]
}

fun sum(number1: Int, number2: Int): Int = number1 + number2