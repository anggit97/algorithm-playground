package LuckyNumberInMatrix

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LuckyNumberInMatrixTest {

    private lateinit var SUT: LuckyNumberInMatrix

    @BeforeEach
    fun setup() {
        SUT = LuckyNumberInMatrix()
    }

    @Test
    fun luckyNumberInMatric() {
        assertEquals(
            listOf(15),
            SUT.luckyNumbers(
                arrayOf(
                    intArrayOf(3, 7, 8),
                    intArrayOf(9, 11, 13),
                    intArrayOf(15, 16, 17)
                )
            )
        )

        assertEquals(
            listOf(12),
            SUT.luckyNumbers(
                arrayOf(
                    intArrayOf(1, 10, 4, 2),
                    intArrayOf(9, 3, 8, 7),
                    intArrayOf(15, 16, 17, 12)
                )
            )
        )

        assertEquals(
            listOf(7),
            SUT.luckyNumbers(
                arrayOf(
                    intArrayOf(7, 8),
                    intArrayOf(1, 2)
                )
            )
        )
    }


    @Test
    fun luckyNumberInMatric2() {
        assertEquals(
            listOf(15),
            SUT.luckyNumberFindAllPossible(
                arrayOf(
                    intArrayOf(3, 7, 8),
                    intArrayOf(9, 11, 13),
                    intArrayOf(15, 16, 17)
                )
            )
        )

        assertEquals(
            listOf(12),
            SUT.luckyNumberFindAllPossible(
                arrayOf(
                    intArrayOf(1, 10, 4, 2),
                    intArrayOf(9, 3, 8, 7),
                    intArrayOf(15, 16, 17, 12)
                )
            )
        )

        assertEquals(
            listOf(7),
            SUT.luckyNumberFindAllPossible(
                arrayOf(
                    intArrayOf(7, 8),
                    intArrayOf(1, 2)
                )
            )
        )
    }
}