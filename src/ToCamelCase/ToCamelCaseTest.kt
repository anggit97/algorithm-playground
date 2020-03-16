package ToCamelCase

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class ToCamelCaseTest {

    private lateinit var SUT: ToCamelCase

    @BeforeEach
    internal fun setUp() {
        SUT = ToCamelCase()
    }

    @Test
    fun toCamelCase() {
        assertEquals("", SUT.toCamelCase(""))
        assertEquals("theStealthWarrior", SUT.toCamelCase("the_stealth_warrior"))
        assertEquals("TheStealthWarrior", SUT.toCamelCase("The-Stealth-Warrior"))
        assertEquals("ABC", SUT.toCamelCase("A-B-C"))
    }
}