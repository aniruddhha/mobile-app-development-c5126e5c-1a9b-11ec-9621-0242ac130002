package com.aniruddha.kudalkar.kotlinbasics.scpfn

private class Person(
    val name: String,
    var age: Int,
    var city: String
) {
    fun moveTo(newCity : String) {
        this.city = newCity
    }

    fun celebrateBirthday() {
        age++
    }
}

private fun demo1() { // access by it
    //The context object is available as an argument (it).
    // The return value is the lambda result.

    val p = Person("abc",12,"vvv")
    p.celebrateBirthday()

    val q = Person("abc",12,"vvv")
    q.moveTo("lll")
    p.celebrateBirthday()

    // The scope functions do not introduce any new technical capabilities,
    // but they can make your code more concise and readable.

    Person(
        "bcd",
        89,
        "nnn"
    ).let {
        it.moveTo("kkk")
        it.celebrateBirthday()
    }

   val list = listOf<String?>("abc", "pqr", "lmn", null, "ghh", "nnm")
    list.forEach { el ->
        el?.let {
            println(it.uppercase())
        }
    }
}

private fun demo2() { // with -> access by this keyword
    // A non-extension function: the context object is passed as an argument,
    // but inside the lambda, it's available as a receiver (this).
    // The return value is the lambda result.

    val p = Person( "abc", 12, "nnn" )
    val q = with(p) {
//        name = "nnn"
        age = 12
        city = "jjj"
        this.celebrateBirthday()
        this.moveTo("mmm")
    }
}

private fun demo3() {

}

fun main() {
    demo1()
    demo2()
}