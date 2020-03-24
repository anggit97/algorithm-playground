package PickingNumber

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PickingNumberTest {

    private lateinit var SUT: PickingNumber

    @BeforeEach
    fun setup() {
        SUT = PickingNumber()
    }

    @Test
    fun pickingNumber() {
        assertEquals(
            3, SUT.pickingNumbers(
                arrayOf(4, 6, 5, 3, 3, 1)
            )
        )

        assertEquals(
            5, SUT.pickingNumbers(
                arrayOf(1, 2, 2, 3, 1, 2)
            )
        )
    }
}