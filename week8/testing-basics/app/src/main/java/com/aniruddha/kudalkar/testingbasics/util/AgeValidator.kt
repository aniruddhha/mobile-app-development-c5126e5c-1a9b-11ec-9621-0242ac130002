package com.aniruddha.kudalkar.testingbasics.util

class AgeValidator {

    companion object {
        fun isValid(age : Int) = when  {
            age >= 52 -> false
            age <= 12 -> false
            age == 30 -> false
            else -> true
        }
    }
}