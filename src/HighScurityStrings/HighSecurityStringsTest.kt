package HighScurityStrings

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class HighSecurityStringsTest {

    private lateinit var SUT: HighSecurityStrings

    @BeforeEach
    fun setup() {
        SUT = HighSecurityStrings()
    }

    @Test
    fun highSecurityString() {
        assertEquals(91, SUT.getStrength("hellomrz", 2))
        assertEquals(5, SUT.getStrength("aaaaa", 1))
        assertEquals(0, SUT.getStrength("cccc", 24))
    }
}