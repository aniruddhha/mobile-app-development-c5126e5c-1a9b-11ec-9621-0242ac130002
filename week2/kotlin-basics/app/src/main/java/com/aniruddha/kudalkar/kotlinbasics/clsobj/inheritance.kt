package com.aniruddha.kudalkar.kotlinbasics.clsobj

open class Config(
    open val pool: Int
) { // by default every class extends `Any` class

    init {
        println(" Pool is $pool")
    }

    open fun doConfiguration() {
        println("Inside Config class")
    }
}

class DbConfig(
    override val pool: Int = 10 // default value
) : Config(pool) { // dbconfig is a config

    init {
        println("In Db - ${pool}")
    }
    override fun doConfiguration() {
        super.doConfiguration()
        println("Inside Db Configuration")
        // code related to db
    }
}

class FileConfig : Config(23) { // fileconfig is a config
    override fun doConfiguration() {
        super.doConfiguration()
        println("Inside File Configuration")
        // code related to file
    }
}

fun main() {

    val cfg1: Config = Config(56)
//    cfg1.doConfiguration()

    val cfg2: DbConfig = DbConfig(89)
//    cfg2.doConfiguration()
//
    val cfg3: FileConfig = FileConfig()
//    cfg3.doConfiguration()

//    val i: Int = 10
//    val cfg4: Config = DbConfig()
//    cfg4.doConfiguration() // -> output ? -> Inside Db Configuration
//    val cfg5: Config = FileConfig()
//    cfg5.doConfiguration() // -> output ? -> Inside File Configuration

    //val cfg6: DbConfig = Config() //-> wont work
    //val cfg7: FileConfig = Config() //-> wont work
}