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

    @Test
    fun saveThePrisonnerV2() {
        assertEquals(2, SUT.saveThePrisonerV2(5, 2, 1))
        assertEquals(3, SUT.saveThePrisonerV2(5, 2, 2))
        assertEquals(6, SUT.saveThePrisonerV2(7, 19, 2))
        assertEquals(3, SUT.saveThePrisonerV2(3 ,7, 3))
    }

    @Test
    fun saveThePrisonnerV3() {
        assertEquals(2, SUT.saveThePrisonerV3(5, 2, 1))
        assertEquals(3, SUT.saveThePrisonerV3(5, 2, 2))
        assertEquals(6, SUT.saveThePrisonerV3(7, 19, 2))
        assertEquals(3, SUT.saveThePrisonerV3(3 ,7, 3))
    }
}