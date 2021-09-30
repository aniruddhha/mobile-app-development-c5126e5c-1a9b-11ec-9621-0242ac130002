package com.aniruddha.kudalkar.kotlinbasics.collection

import java.util.LinkedList

private fun demo1(){
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

    list.forEach(fun (el){ // function
        println(el)
    })
}

fun main() {
    demo1()
}