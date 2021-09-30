package com.aniruddha.kudalkar.kotlinbasics.clsobj

private class Car { // combination of state and behaviour
    var speed = 10 // state

    fun speedUp() = ++speed // behaviour = inline functions

    fun putNthGear(n : Int) { // behaviour
        println("Speed Is ${speedUp() * n}")
    }
}

fun main() {
    val c = Car() // object of the car
    println("Speed Is ${c.speedUp()}") // method call on object
    c.putNthGear(2) // method call on object
}
