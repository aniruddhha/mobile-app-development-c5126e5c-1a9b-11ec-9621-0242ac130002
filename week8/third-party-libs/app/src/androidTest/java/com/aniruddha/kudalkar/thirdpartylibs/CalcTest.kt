package com.aniruddha.kudalkar.thirdpartylibs

import org.junit.Assert
import org.junit.Test

class CalcTest {

    @Test
    fun check_Addition() {

        val calc = Calc()
        Assert.assertTrue(calc.addition(20, 30) == 50)
    }
}