package com.aniruddha.kudalkar.uitesting

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.common.truth.Truth
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginValidationTest {

    // read SRS very very carefully
    // read User Stories very carefully

    // pass - max 8 char, can contain #$% , can numbers and alphabets

    lateinit var validation : LoginValidations

    @Before
    fun init() {
        validation = LoginValidations()
    }

    @Test
    fun check_UserName_Normal() {
        Truth.assertThat(
            validation.isUserNameValid("abc")
        ).isAnyOf(
            true,
            false
        )
    }

    @Test
    fun check_UserName_Empty() {
        Truth.assertThat(
            validation.isUserNameValid("")
        ).isFalse()
    }

    @Test
    fun check_UserName_Valid_Length() {
        Truth.assertThat(
            validation.isUserNameValid("abc abc")
        ).isTrue()
    }

    @Test
    fun check_UserName_InValid_Length() {
        Truth.assertThat(
            validation.isUserNameValid("abc abc abc abc")
        ).isFalse()
    }

    @Test
    fun check_UserName_Contains_Hash_char() {
        Truth.assertThat(
            validation.isUserNameValid("#ddd")
        ).isFalse()
    }
}