package com.aniruddha.kudalkar.kotlinbasics.clsobj

class Dv(
    private val x: Int,
    private val y: Int
) {
    //Returns a string representation of the object.
    override fun toString() = " x = $x, y = $y "

    fun printXAndY(): String {
        return " x = $x, y = $y "
    }

    override fun equals(other: Any?): Boolean {
        val oth = other as Dv // type casting
        return (this.x == oth.x) && (this.y == oth.y)
    }
}

private fun demo20() {
    // obj = values of state
    // dv1 = values of x & y
    // dv2 = values of x & y

    val dv1 = Dv(10, 465)

    val dv2 = Dv(20, 465)

    println(dv1.equals(dv2))
    println(dv2.equals(dv1))
}

private fun demo23() {

    // For values represented by primitive types at runtime (for example, Int),
    // the === equality check is equivalent to the == check.


    val dv1 = Dv(11,20)
    val dv2 = Dv(10, 20)

    println( "Dv == ${dv1 == dv2}" )
    println( "Dv === ${dv1 === dv2}" )

    val i1 = 10
    val i2 = 20

    println( "i == ${i1 == i2}" )
    println( "i === ${i1 === i2}" )

    val s1 = "abc" // this initialization brings string from common memory area
    val s2 = "abc" // this initialization brings string from common memory area

    println(" S1 == ${s1 == s2}") // structural equality - checks content
    println(" S1 === ${s1 === s2}") // referential equality - check memory references

    val st1 = String("hi".toByteArray()) // new memory reference
    val st2 = String("hi".toByteArray()) // // new memory reference

    println(" St1 == ${st1 == st2}") // structural equality - checks content
    println(" St1 === ${st1 === st2}") // referential equality - check memory references
}
fun main() {
    demo23()
}