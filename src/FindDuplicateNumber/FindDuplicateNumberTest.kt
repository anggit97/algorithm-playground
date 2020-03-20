package FindDuplicateNumber

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FindDuplicateNumberTest {

    private lateinit var SUT: FindDuplicateNumber

    @BeforeEach
    fun setup() {
        SUT = FindDuplicateNumber()
    }

    @Test
    fun findDuplicateNumber() {
        assertEquals(2, SUT.findDuplicate(intArrayOf(1, 3, 4, 2, 2)))
        assertEquals(3, SUT.findDuplicate(intArrayOf(3, 1, 3, 4, 2)))
    }
}