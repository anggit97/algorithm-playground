package SaveThePrisoner

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SaveThePrisonerTest {

    private lateinit var SUT: SaveThePrisoner

    @BeforeEach
    fun setup() {
        SUT = SaveThePrisoner()
    }

    @Test
    fun saveThePrisonner() {
        assertEquals(2, SUT.saveThePrisoner(5, 2, 1))
        assertEquals(3, SUT.saveThePrisoner(5, 2, 2))
        assertEquals(6, SUT.saveThePrisoner(7, 19, 2))
        assertEquals(3, SUT.saveThePrisoner(3 ,7, 3))
    }
}