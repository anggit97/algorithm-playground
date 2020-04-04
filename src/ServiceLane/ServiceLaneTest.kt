package ServiceLane

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ServiceLaneTest {

    private lateinit var SUT: ServiceLane

    @BeforeEach
    fun setup() {
        SUT = ServiceLane()
    }

    @Test
    fun serviceLane() {
        val expected = arrayOf(1, 2, 3, 2, 1).toMutableList()
        val actual = SUT.serviceLane(
            5,
            arrayOf(
                arrayOf(2, 3, 1, 2, 3, 2, 3, 3),
                arrayOf(0, 3),
                arrayOf(4, 6),
                arrayOf(6, 7),
                arrayOf(3, 5),
                arrayOf(0, 7)
            )
        ).toMutableList()

        assertEquals(
            expected,
            actual
        )


        val expected2 = arrayOf(2, 1, 1, 1, 2).toMutableList()
        val actual2 = SUT.serviceLane(
            5,
            arrayOf(
                arrayOf(1, 2, 2, 2, 1),
                arrayOf(2, 3),
                arrayOf(1, 4),
                arrayOf(2, 4),
                arrayOf(2, 4),
                arrayOf(2, 3)
            )
        ).toMutableList()

        assertEquals(
            expected2,
            actual2
        )
    }
}