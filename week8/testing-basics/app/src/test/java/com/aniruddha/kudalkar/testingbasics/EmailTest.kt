package com.aniruddha.kudalkar.testingbasics

import com.aniruddha.kudalkar.testingbasics.util.EmailValidator
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class EmailTest {

    @Test
    fun check_isEmailValid() {
       assertThat(EmailValidator.isValid("aaa@bbb.com")).isTrue()
    }
}