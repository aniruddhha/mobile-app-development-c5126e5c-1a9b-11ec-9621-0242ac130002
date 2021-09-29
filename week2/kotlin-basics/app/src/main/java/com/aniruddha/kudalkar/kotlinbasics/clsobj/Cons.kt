package com.aniruddha.kudalkar.kotlinbasics.clsobj

class Empty1 {  }
class Empty2

//in kotlin 2 types of constructor
// - primary: part of the class header, and it goes after the class name
// - secondary
class Cls1 constructor(nm : String) //primary constructor
class Cls2(nm : String) //primary constructor
class Cls3(nm : String) { // pass values to the constructor
    val name = nm // property/state of class. Assigning value to state
    fun whatYourName() = name
}
class Cls4(val name : String) { // pass and assign in one line
    fun whatYourName() = name
}

fun main() {
    val c1 = Cls3("android")
    println("Name is ${c1.whatYourName()}")

    val c2 = Cls3("iOS")
    println("Name is ${c2.whatYourName()}")

    val c3 = Cls4("again android")
    println("Name is ${c3.whatYourName()}")
}



