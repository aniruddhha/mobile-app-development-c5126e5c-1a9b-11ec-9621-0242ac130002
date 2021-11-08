package com.aniruddha.kudalkar.testingbasics.util

import java.util.regex.Pattern

class EmailValidator {
    companion object {
        fun isValid(email: String) = Pattern.compile(
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+"
        ).matcher(email).matches()


        // minimum age should be 12
        // maximum age should be 52
        // age is 12, 52, 30 is invalid
        fun isAgeValid(age : Int) = 0
    }
}