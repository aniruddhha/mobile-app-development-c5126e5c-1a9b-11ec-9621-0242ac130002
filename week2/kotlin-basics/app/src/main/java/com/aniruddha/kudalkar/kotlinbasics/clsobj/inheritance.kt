package com.aniruddha.kudalkar.kotlinbasics

open class Config { // by default every class extends `Any` class
    fun doConfiguration() {
        println("In Side Config class")
    }
}

class DbConfig : Config() { // dbconfig is a config

}

class FileConfig : Config() // fileconfig is a config

fun main() {

    val cfg1 = Config()
    cfg1.doConfiguration()

    val cfg2 = DbConfig()
    cfg2.doConfiguration()

    val cfg3 = FileConfig()
    cfg3.doConfiguration()
}