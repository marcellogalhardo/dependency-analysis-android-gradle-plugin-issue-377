package dev.marcellogalhardo.buildhealthsample

import androidx.fragment.app.Fragment
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainFragmentTest {

    @Test
    fun testEventFragment() {
        launchFragmentInContainer<Fragment>()
    }
}
