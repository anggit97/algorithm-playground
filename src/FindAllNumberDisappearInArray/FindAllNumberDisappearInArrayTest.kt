package FindAllNumberDisappearInArray

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FindAllNumberDisappearInArrayTest {

    private lateinit var SUT: FindAllNumberDisappearInArray

    @BeforeEach
    fun setup() {
        SUT = FindAllNumberDisappearInArray()
    }

    @Test
    fun findAllNumberDisappearInArray() {
        assertEquals(
            listOf(5, 6),
            SUT.findDisappearedNumbers(
                intArrayOf(
                    4, 3, 2, 7, 8, 2, 3, 1
                )
            )
        )
    }
}