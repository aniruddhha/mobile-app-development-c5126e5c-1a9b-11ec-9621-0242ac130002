package com.aniruddha.kudalkar.testingbasics

import com.aniruddha.kudalkar.testingbasics.util.EmailValidator
import org.junit.*
import org.junit.Assert.*

class EmailTest {

    @Test
    fun check_isEmailValid_Proper() {
       assertTrue(EmailValidator.isValid("aaa@bbb.com"))
    }

    @Test
    fun check_isEmailValid_No_First_Part() {
        assertFalse(EmailValidator.isValid("@bbb.com"))
    }

    @Test
    fun check_isEmailValid_No_Second_Part() {
        assertFalse(EmailValidator.isValid("aaa@.com"))
    }

    @Test
    fun check_isEmailValid_No_Domain() {
        assertFalse(EmailValidator.isValid("aaa@bb"))
    }

    @Test
    fun check_isEmailValid_Only_Name() {
        assertFalse(EmailValidator.isValid("aaa@bb"))
    }
}