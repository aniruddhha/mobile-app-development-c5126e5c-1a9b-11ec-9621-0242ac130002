package com.aniruddha.kudalkar.kotlinbasics.clsobj

open class Config { // by default every class extends `Any` class
    open fun doConfiguration() {
        println("Inside Config class")
    }
}

class DbConfig : Config() { // dbconfig is a config
    override fun doConfiguration() {
        println("Inside Db Configuration")
        // code related to db
    }
}

class FileConfig : Config() { // fileconfig is a config
    override fun doConfiguration() {
        println("Inside File Configuration")
        // code related to file
    }
}

fun main() {

    val cfg1 = Config()
    cfg1.doConfiguration()

    val cfg2 = DbConfig()
    cfg2.doConfiguration()

    val cfg3 = FileConfig()
    cfg3.doConfiguration()
}