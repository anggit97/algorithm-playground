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
    }
}