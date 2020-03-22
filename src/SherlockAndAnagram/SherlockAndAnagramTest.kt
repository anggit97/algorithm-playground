package SherlockAndAnagram

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SherlockAndAnagramTest{

    private lateinit var SUT: SherlockAndAnagram

    @BeforeEach
    fun setup(){
        SUT = SherlockAndAnagram()
    }

    @Test
    fun sherlockAndAnagram(){
        assertEquals(4, SUT.sherlockAndAnagrams("abba"))
        assertEquals(0, SUT.sherlockAndAnagrams("abcd"))
        assertEquals(3, SUT.sherlockAndAnagrams("ifailuhkqq"))
        assertEquals(10, SUT.sherlockAndAnagrams("kkkk"))
    }
}