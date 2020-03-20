package Anagram

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AnagramTest{

    private lateinit var SUT: Anagram

    @BeforeEach
    fun setup(){
        SUT = Anagram()
    }

    @Test
    fun isAnagram(){
        assertEquals(true, SUT.isAnagram("anagram", "nagaram"))
    }
}