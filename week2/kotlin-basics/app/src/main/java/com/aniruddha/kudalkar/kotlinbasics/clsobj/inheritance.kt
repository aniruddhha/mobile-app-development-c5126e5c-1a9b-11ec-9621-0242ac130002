package com.aniruddha.kudalkar.kotlinbasics.clsobj

open class Config { // by default every class extends `Any` class

    open val pool : Int = 12

    open fun doConfiguration() {
        println("Inside Config class")
    }
}

class DbConfig : Config() { // dbconfig is a config

    override val pool = 56

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

    val cfg1: Config = Config()
    cfg1.doConfiguration()

    val cfg2: DbConfig = DbConfig()
    cfg2.doConfiguration()

    val cfg3: FileConfig = FileConfig()
    cfg3.doConfiguration()

    val i: Int = 10
    val cfg4: Config = DbConfig()
    cfg4.doConfiguration() // -> output ? -> Inside Db Configuration
    val cfg5: Config = FileConfig()
    cfg5.doConfiguration() // -> output ? -> Inside File Configuration

    //val cfg6: DbConfig = Config() //-> wont work
    //val cfg7: FileConfig = Config() //-> wont work
}