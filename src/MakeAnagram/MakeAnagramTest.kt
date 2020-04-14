package MakeAnagram

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MakeAnagramTest {

    private lateinit var SUT: MakeAnagram

    @BeforeEach
    fun setup() {
        SUT = MakeAnagram()
    }

    @Test
    fun makeAnagram() {
        assertEquals(4, SUT.makeAnagram("cde", "abc"))
        assertEquals(2, SUT.makeAnagram("cde", "dcf"))
    }
}