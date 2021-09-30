package com.aniruddha.kudalkar.kotlinbasics.collection

import java.util.ArrayList
import java.util.LinkedList

private fun demo1() {
    val list = LinkedList<String>()
    list.add("abc")
    list.add("pqr")
    list.add("zyc")
    list.add("lmn")

    /*for( el in list ) {
        println("Element is $el")
    }*/

    list.forEach { // final representation
        println(it)
    }

    list.forEach() { el -> // trailing lambda
        println(el)
    }

    list.forEach({ el -> // lambda
        println(el)
    })

    list.forEach(fun(el) { // function
        println(el)
    })
}

private fun demo2() {
    val list = listOfNotNull(1, 89, 56, 42, 6, 78, 96, 10)

    // i want to find element which are > 40
    list.forEach {
        if (it > 40) {
            print("$it, ")
        }
    }
    println()

    val filteredList = list.filter { it > 40 }
    println(filteredList.toString())

    val lst = list.findLast { it > 40 }
    println(lst)

    println("First - ${list.first()}")
    println("Last - ${list.last()}")

    val max = list.maxOrNull() ?: -1
    println("Max On List is $max")
}

private fun demo3() {
    val list1 = listOfNotNull(1, 89, 56, 42, 6, 78, 96, 10)
    val list2 = listOfNotNull(10, 72, 41, 36, 711, 211, 96, 10)

    val commons = list1.filter { list2.contains(it) }
    println(commons)
}

private fun demo4() {
    // create new list with each item to squared
    val list = listOfNotNull(1, 89, 56, 42, 6, 78, 96, 10)

    val squared = ArrayList<Int>()
    list.forEach { squared.add(it * it) }

    val sqd = list.map { it * it }
    list.map(fun(el): Int {
        return el * el
    })

    println(list)
    println(squared)
    println(sqd)
}

fun main() {
    demo4()
}