package BeatifulDaysAtMovies

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BeatifulDaysAtMoviesTest {

    private lateinit var SUT: BeatifulDaysAtMovies

    @BeforeEach
    fun setup() {
        SUT = BeatifulDaysAtMovies()
    }

    @Test
    fun beatifulDaysAtMovies() {
        assertEquals(2, SUT.beautifulDays(20, 23, 6))
        assertEquals(33, SUT.beautifulDays(13, 45, 3))
    }
}