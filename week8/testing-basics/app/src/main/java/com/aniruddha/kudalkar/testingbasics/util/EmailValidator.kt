package com.aniruddha.kudalkar.testingbasics.util

import android.text.TextUtils
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


        fun isEmailValid(email : String) = !TextUtils.isEmpty(email) &&
                android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }
}