package com.aniruddha.kudalkar.uitesting

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.View
import android.widget.Button
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

import androidx.test.espresso.matcher.BoundedMatcher
import org.hamcrest.Description

@RunWith(AndroidJUnit4::class)
@LargeTest
class FirstFragmentTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    private val customMatcher = object : BoundedMatcher<View?, Button>(Button::class.java) {
        override fun matchesSafely(btn: Button): Boolean {
            val bgCl = btn.background as ColorDrawable
            return bgCl.color == Color.RED
        }
        override fun describeTo(description: Description) {
            description.appendText("with text color: ")
        }
    }

    @Test
    fun test_Next_Button_Loaded() {
        onView(
            withText("NEXT")
        ).check(
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
            matches(
                withText("ABC")
            )
        )
    }

    @Test
    fun check_color() {
        onView(
            withId(R.id.button_first)
        ).check(
            matches(
                customMatcher
            )
        )
    }
}