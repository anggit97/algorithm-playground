package LisaWorkbook

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LisaWorkbookTest {

    private lateinit var SUT: LisaWorkbook

    @BeforeEach
    fun setup() {
        SUT = LisaWorkbook()
    }

    @Test
    fun lisaWorkbook() {
        assertEquals(4, SUT.workbook(5, 3, arrayOf(4, 2, 6, 1, 10)))
        assertEquals(8, SUT.workbook(10, 5, arrayOf(3, 8, 15, 11, 14, 1, 9, 2, 24, 31)))
        assertEquals(100, SUT.workbook(1, 1, arrayOf(100)))
    }
}