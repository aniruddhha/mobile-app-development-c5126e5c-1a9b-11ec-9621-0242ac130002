package com.aniruddha.kudalkar.testingbasics

import com.aniruddha.kudalkar.testingbasics.util.AgeValidator
import com.google.common.truth.Truth.*
import org.junit.Test

class AgeTest {

    @Test
    fun age_is_negative() {
        assertThat(AgeValidator.isValid(-2)).isFalse()
    }

    @Test
    fun age_is_lower_bound() {
        assertThat(AgeValidator.isValid(12)).isFalse()
    }

    @Test
    fun age_is_upper_bound() {
        assertThat(AgeValidator.isValid(52)).isFalse()
    }
}