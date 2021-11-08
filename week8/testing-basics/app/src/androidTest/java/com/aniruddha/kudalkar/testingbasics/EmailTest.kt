package com.aniruddha.kudalkar.testingbasics

import com.aniruddha.kudalkar.testingbasics.util.EmailValidator
import com.google.common.truth.Truth.*
import org.junit.Test

class InstEmailTest {

    @Test
    fun check_email_valid() {
        assertThat(EmailValidator.isEmailValid("aaa@bbb.com")).isTrue()
    }
}