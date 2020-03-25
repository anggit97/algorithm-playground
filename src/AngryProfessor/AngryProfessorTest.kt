package AngryProfessor

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AngryProfessorTest {

    private lateinit var SUT: AngryProfessor

    @BeforeEach
    fun setup() {
        SUT = AngryProfessor()
    }

    @Test
    fun angryProfessor() {
        assertEquals("YES", SUT.angryProfessor(3, arrayOf(-1, -3, 4, 2)))
        assertEquals("NO", SUT.angryProfessor(2, arrayOf(0, -1, 2, 1)))
    }
}