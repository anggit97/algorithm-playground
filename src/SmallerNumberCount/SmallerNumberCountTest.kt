package SmallerNumberCount

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SmallerNumberCountTest {

    private lateinit var SUT: SmallerNumberCount

    @BeforeEach
    fun setup() {
        SUT = SmallerNumberCount()
    }

    @Test
    fun findSmallerNumberThenCurrent() {
        assertEquals(
            intArrayOf(4, 0, 1, 1, 3).toMutableList(),
            SUT.smallerNumbersThanCurrent(intArrayOf(8, 1, 2, 2, 3)).toMutableList()
        )

        assertEquals(
            intArrayOf(2, 1, 0, 3).toMutableList(),
            SUT.smallerNumbersThanCurrent(intArrayOf(6, 5, 4, 8)).toMutableList()
        )

        assertEquals(
            intArrayOf(0, 0, 0, 0).toMutableList(),
            SUT.smallerNumbersThanCurrent(intArrayOf(7, 7, 7, 7)).toMutableList()
        )
    }
}