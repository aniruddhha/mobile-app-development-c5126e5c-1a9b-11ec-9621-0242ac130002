package com.aniruddha.kudalkar.kotlinbasics.clsobj

private interface ClickListener {
    var pos : Int
    fun onClick()
}

private open class Device

private abstract class JoyStick : ClickListener

private class Mouse : Device(), ClickListener {
    override var pos: Int = 10

    override fun onClick() = println("Mouse Clicked")

    fun move() {
        println("Moving")
    }
}

fun main() {
    val ms = Mouse()
    ms.move()
    ms.onClick()
}
