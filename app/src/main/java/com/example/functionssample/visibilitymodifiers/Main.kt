package com.example.functionssample.visibilitymodifiers

fun main(){

    val instanceC = C()
    instanceC.accessClassA()

    val instanceB = B()
    instanceB.accessClassAFromB()

    val instanceD = D()
    instanceD.accessAFromD()
}