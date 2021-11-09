package com.aniruddha.kudalkar.uitesting

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class FirstFragmentTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun test_Next_Button_Loaded() {
        onView(withText("NEXT"))
            .check(
                matches(isDisplayed())
            )
    }

    @Test
    fun test_EditText_Loaded() {
        onView(withId(R.id.etDt))
            .check(
                matches(isDisplayed())
            )
    }

    @Test
    fun test_EditText_Input() {

        val text = "abc"

        onView(
            withId(R.id.etDt)
        ).perform(
            clearText(),
            typeText(text)
        )

        onView(
            withId(R.id.etDt)
        ).check(
            matches(withText("abc"))
        )
    }

    @Test
    fun test_Perform_Click() {

        val text = "abc"

        onView(
            withId(R.id.etDt)
        ).perform(
            clearText(),
            typeText(text)
        )

        onView(
            withId(R.id.button_first)
        ).perform(
            click()
        )

        onView(
            withId(R.id.etDt)
        ).check(
            matches(withText("ABC"))
        )
    }
}