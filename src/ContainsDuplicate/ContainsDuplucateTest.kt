package ContainsDuplicate

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ContainsDuplucateTest {

    private lateinit var SUT: ContainsDuplucate

    @BeforeEach
    fun setup() {
        SUT = ContainsDuplucate()
    }

    @Test
    fun containDuplicate() {
        assertEquals(true, SUT.containsDuplicate(intArrayOf(1, 2, 3, 1)))
        assertEquals(false, SUT.containsDuplicate(intArrayOf(1, 2, 3, 4)))
        assertEquals(true, SUT.containsDuplicate(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)))
    }
}