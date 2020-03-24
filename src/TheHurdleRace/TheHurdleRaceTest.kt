package TheHurdleRace

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TheHurdleRaceTest {

    private lateinit var SUT: TheHurdleRace

    @BeforeEach
    fun setup() {
        SUT = TheHurdleRace()
    }

    @Test
    fun theHurdleRace() {
        assertEquals(
            2,
            SUT.hurdleRace(
                4,
                arrayOf(
                    1, 6, 3, 5, 2
                )
            )
        )

        assertEquals(
            0,
            SUT.hurdleRace(
                7,
                arrayOf(
                    2, 5, 4, 5, 2
                )
            )
        )
    }
}