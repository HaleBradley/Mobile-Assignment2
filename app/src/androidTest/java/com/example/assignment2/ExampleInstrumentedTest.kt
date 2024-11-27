package com.example.assignment2

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.assignment2", appContext.packageName)
    }

    @get:Rule
    val composeTestRule = createAndroidComposeRule<SecondActivity>()

    @Test
    fun verifyMobileChallengesTextsDisplayed() {
        // Check that challenge text is there
        composeTestRule.onNodeWithText("1. Device Fragmentation")
            .assertIsDisplayed()
        composeTestRule.onNodeWithText("Creating apps that function on any device. This takes in screen sizes, hardware, and other limitations between devices.")
            .assertIsDisplayed()
    }
}