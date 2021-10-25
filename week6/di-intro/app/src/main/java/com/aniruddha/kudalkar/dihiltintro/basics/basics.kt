package com.aniruddha.kudalkar.dihiltintro.basics

import java.lang.Exception

// car is having engine - srs
// car is requiring the engine - developers understanding
// car is dependent on engine - architects understanding
// if you want to create object of car you need to have ready object of engine - compilers understanding

class Car(
    val eng: Engine // loose coupling
)

class Bmw {
    lateinit var engine : Engine

    fun start(eng : Engine)  {
        engine = eng
    }
}

open class Engine

class LiEngine : Engine()

fun main() {

    val eng = Engine()
    val cr = Car(eng) // constructor injection

    val engLi = LiEngine()
    val cr2 = Car(engLi)

    val bmw = Bmw()
    bmw.start(eng) // setter injection
}
