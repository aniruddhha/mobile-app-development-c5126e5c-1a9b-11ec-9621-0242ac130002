package com.aniruddha.kudalkar.uitesting

import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class LoginScreenTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun check_Login() {
        onView(
            withId(R.id.etUsNm)
        ).perform(
            clearText(),
            typeText("abc")
        )

        onView(
            withId(R.id.etPass)
        ).perform(
            clearText(),
            typeText("abc")
        )

        onView(
            withId(R.id.btNx)
        ).perform(
            click()
        )

        onView(
            withId(R.id.checkBox)
        ).check(
            matches(
                isDisplayed()
            )
        )

        onView(
            withId(R.id.rec)
        ).check(
            matches(
                isDisplayed()
            )
        )

        onView(
            withId(R.id.checkBox)
        ).perform(
            click()
        )

        onView(
            withId(R.id.checkBox)
        ).perform(
            click()
        )

        onView(
            withId(R.id.checkBox)
        ).perform(
            click()
        )

        onView(
            withId(R.id.checkBox)
        ).perform(
            click()
        )

        onView(
            withId(R.id.checkBox)
        ).perform(
            click()
        )

        onView(
            withId(R.id.checkBox)
        ).perform(
            click()
        )
    }
}