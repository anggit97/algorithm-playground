package MarkAndToys

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MarkAndToysTest {

    private lateinit var SUT: MarkAndToys

    @BeforeEach
    fun setup() {
        SUT = MarkAndToys()
    }

    @Test
    fun markAndToys() {
        assertEquals(4, SUT.maximumToys(arrayOf(1, 12, 5, 111, 200, 1000, 10), 50))
        assertEquals(3, SUT.maximumToys(arrayOf(3, 7, 2, 9, 4), 15))
        assertEquals(3, SUT.maximumToys(arrayOf(1, 2, 3, 4), 7))
    }
}