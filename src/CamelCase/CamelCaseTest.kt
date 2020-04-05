package CamelCase

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CamelCaseTest{

    private lateinit var SUT: CamelCase

    @BeforeEach
    fun setup(){
        SUT = CamelCase()
    }

    @Test
    fun camelCaseTest(){
        assertEquals(5, SUT.camelcase("saveChangesInTheEditor"))
        assertEquals(3, SUT.camelcase("oneTwoThree"))
    }
}