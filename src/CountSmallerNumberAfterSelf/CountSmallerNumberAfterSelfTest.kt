package CountSmallerNumberAfterSelf

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CountSmallerNumberAfterSelfTest {

    private lateinit var SUT: CountSmallerNumberAfterSelf

    @BeforeEach
    fun setup() {
        SUT = CountSmallerNumberAfterSelf()
    }

    @Test
    fun countSmallerNumberAfterSelf() {
        assertEquals(listOf(2, 1, 1, 0), SUT.countSmaller(intArrayOf(5, 2, 6, 1)))
        assertEquals(listOf(0, 0), SUT.countSmaller(intArrayOf(-1, -1)))
        assertEquals(listOf(), SUT.countSmaller(intArrayOf()))
    }
}