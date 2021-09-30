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

    override fun toString(): String {
        return "name = $name, age = $age, city = $city"
    }
}

private fun demo() {

    val p = Person("abc",12,"vvv")
    p.celebrateBirthday()

    val q = Person("abc",12,"vvv")
    q.moveTo("lll")
    p.celebrateBirthday()
}

private fun demo1() { // access by it
    //The context object is available as an argument (it).
    // The return value is the lambda result.

    // The scope functions do not introduce any new technical capabilities,
    // but they can make your code more concise and readable.

    // let Person object perform this work
    Person(
        "bcd",
        89,
        "nnn"
    ).let {
        it.moveTo("kkk")
        it.celebrateBirthday()
    }
}

private fun demo2() { // with -> access by this keyword
    // A non-extension function: the context object is passed as an argument,
    // but inside the lambda, it's available as a receiver (this).
    // The return value is the lambda result.

    val p = Person( "abc", 12, "nnn" )
    val q = with(p) {
//        name = "nnn"

        // kindly execute with p and give me result back
        // you are doing just processing i.e. setting
        p.age = 78
        p.city = "bbbb"

        // modified results
        Person("abxc", this.age, this.city)
    }
    println("P ${p}")
    println("Q ${q}")
}

private fun demo3() {

    // The context object is available as a receiver (this).
    // The return value is the object itself.

    // along performing operations, apply processing and get me same object back
    val pr = Person("abc", 78, "uuu")
        .apply {
        this.age = 20
        this.city = "bnn"

        // some operation that will change the sate
    }
    println(pr)
}

private fun demo4() {
    // The context object is available as an argument (it).
    // The return value is the object itself.

    // let Person object perform this work; also get me same object back
    val pr = Person("abc", 78, "uuu").also {
        it.age = 20
        it.city = "bnn"
        // some operation that will change the sate
    }
}

fun main() {
    demo2()
}