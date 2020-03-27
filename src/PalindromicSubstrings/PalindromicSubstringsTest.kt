package PalindromicSubstrings

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PalindromicSubstringsTest {

    private lateinit var SUT: PalindromicSubstrings

    @BeforeEach
    fun setup() {
        SUT = PalindromicSubstrings()
    }

    @Test
    fun palindromicSubstring() {
        assertEquals(3, SUT.countSubstrings("abc"))
    }
}