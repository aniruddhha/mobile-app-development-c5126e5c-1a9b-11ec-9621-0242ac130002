package com.aniruddha.kudalkar.kotlinbasics.collection

import java.util.*

private fun demo1() {
    val list = LinkedList<String?>()
    list.add("abc")
    list.add("pqr")
    list.add("zyc")
    list.add("lmn")
    list.add(null)
    list.add("lmn")
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

    val arr1 = arrayOf(1, 89, 56, 42, 6, 78, 96, 10)
    val arr2 = arrayOf(10, 72, 41, 36, 711, 211, 96, 10)

    arr1.filter { arr2.contains(it) }
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

fun myFn(n : Int) : Unit {

}

fun demo5() {
    val list = listOfNotNull(1, 89, 56, 42, 6, 78, 96, 10)
    list.forEach(::println) // method reference
    list.forEach(::myFn) // method reference
    list.forEach({ el -> print(el) }) // lambda
    list.forEach{ print(it) } // lambda
    list.forEach(fun(n : Int){ // anonymous
        print(n)
    })
}

fun demo6() {
    val set = setOf<String?>("abc", null, "zxv", "pqr", "hij" ,"abc", "lmn")
    set.forEach(::println) // no duplicates it considers

    println("---------------------")
    val set1 = setOf<String?>("abc","zxv",  "pqr", "hij" ,"abc", "lmn") // remove null
    val arr = set1.toTypedArray() // converts set to array
    val sortedSet = TreeSet<String>(set1) // i will work with data and sort it but I dont need null
    sortedSet.forEach(::println)
    val upperSet = set1.map { it?.uppercase() }

    println("---------------------")
    println(arr.contentToString())
    Arrays.sort(arr)
    println(arr.contentToString())
}

fun demo7() {

}

fun main() {
    demo6()
}