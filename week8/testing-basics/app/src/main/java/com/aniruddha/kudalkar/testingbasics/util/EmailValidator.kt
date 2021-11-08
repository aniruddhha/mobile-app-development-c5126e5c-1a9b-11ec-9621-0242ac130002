package com.aniruddha.kudalkar.testingbasics.util

import android.text.TextUtils

class EmailValidator {
    companion object {
        fun isValid(email: String) =
            !TextUtils.isEmpty(email) &&
                    android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }
}