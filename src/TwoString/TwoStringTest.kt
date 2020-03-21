package TwoString

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TwoStringTest {

    private lateinit var SUT: TwoString

    @BeforeEach
    fun setup() {
        SUT = TwoString()
    }

    @Test
    fun twoString() {
        assertEquals("YES", SUT.twoStrings("hello", "world"))
        assertEquals("NO", SUT.twoStrings("hi", "world"))
    }
}