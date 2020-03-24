package DesignerPDFViewer

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DesignerPDFViewerTest {

    private lateinit var SUT: DesignerPDFViewer

    @BeforeEach
    fun setup() {
        SUT = DesignerPDFViewer()
    }

    @Test
    fun designerPDFViewer() {
        assertEquals(
            9, SUT.designerPdfViewer(
                arrayOf(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5),
                "abc"
            )
        )

        assertEquals(
            28, SUT.designerPdfViewer(
                arrayOf(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7),
                "zaba"
            )
        )
    }
}