package FairRations

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FairRationsTest {

    private lateinit var SUT: FairRations

    @BeforeEach
    fun setup() {
        SUT = FairRations()
    }

    @Test
    fun fairRations() {
        assertEquals(4, SUT.fairRations(arrayOf(2, 3, 4, 5, 6)))
        assertEquals(-1, SUT.fairRations(arrayOf(1, 2)))
    }
}