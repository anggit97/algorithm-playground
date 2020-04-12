package HackerrankInString

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class HackrankInStringTest {

    private lateinit var SUT: HackrankInString

    @BeforeEach
    fun setup() {
        SUT = HackrankInString()
    }

    @Test
    fun hackerRankInString() {
        assertEquals("YES", SUT.hackerrankInString("hereiamstackerrank"))
        assertEquals("NO", SUT.hackerrankInString("hackerworld"))
        assertEquals("YES", SUT.hackerrankInString("hhaacckkekraraannk"))
        assertEquals("NO", SUT.hackerrankInString("rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt"))
    }
}