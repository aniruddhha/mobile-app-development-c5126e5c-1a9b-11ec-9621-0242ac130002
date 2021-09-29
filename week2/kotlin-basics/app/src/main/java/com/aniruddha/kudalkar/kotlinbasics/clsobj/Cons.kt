package com.aniruddha.kudalkar.kotlinbasics.clsobj

class Empty1 {}
class Empty2

//in kotlin 2 types of constructor
// - primary: part of the class header, and it goes after the class name
// - secondary: which are prefixed with constructor

class Cls1 constructor(nm: String) //primary constructor
class Cls2(nm: String) //primary constructor

class Cls3(nm: String) { // pass values to the constructor
    val name = nm // property/state of class. Assigning value to state

    fun whatYourName(): String {
        return name
    }
}
class Cls4(val name: String) { // pass and assign in one line
    fun whatYourName() = name
}

class Cls5 {
    val dt : String

    constructor(d: String) { // secondary constructor
        dt = d
    }
}
/*
    If the class has a primary constructor, each secondary constructor needs to
    delegate to the primary constructor, either directly or indirectly through
    another secondary constructor(s). Delegation to another constructor of the
    same class is done using the this keyword
 */
class Cls6(val dt : String) { // primary
    constructor(d: String,  n: Int): this(d) {// secondary -> `this` will point to primary
        // here d is for satisfying primary constructor
        // integer n is used to perform some logic
    }
    constructor(d: String,  n: Double): this(d) {// secondary -> `this` will point to primary
        // here d is for satisfying primary constructor
        // double n is used to perform some logic
    }
}

fun main() {
    val c1 = Cls3("android")
    println("Name is ${c1.whatYourName()}")

    val c2 = Cls3("iOS")
    println("Name is ${c2.whatYourName()}")

    val c3 = Cls4("again android")
    println("Name is ${c3.whatYourName()}")

    val c4 = Cls5("android")
    println(" Dt is ${c4.dt}")

    val c5 = Cls6("primary") // call to primary
    val c6 = Cls6("primary", 10) // call to secondary
    val c7 = Cls6("primary", 10.6) // call to secondary
}



