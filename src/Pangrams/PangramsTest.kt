package Pangrams

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PangramsTest {

    private lateinit var SUT: Pangrams

    @BeforeEach
    fun setup() {
        SUT = Pangrams()
    }

    @Test
    fun pangrams() {
        assertEquals("pangram", SUT.pangrams("We promptly judged antique ivory buckles for the next prize"))
        assertEquals("not pangram", SUT.pangrams("We promptly judged antique ivory buckles for the prize"))
    }
}