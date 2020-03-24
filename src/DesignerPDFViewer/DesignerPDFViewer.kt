package DesignerPDFViewer

class DesignerPDFViewer {

    /**
     * O(n) Time
     * O(n) Space
     */
    fun designerPdfViewer(h: Array<Int>, word: String): Int {
        val charDic = mutableMapOf<Char, Int>()

        var char = 'a'
        for (heightChar in h) {
            charDic[char] = heightChar
            char++
        }

        var maxHeight = 0
        for (singleWord in word) {
            val height = charDic[singleWord]
            if (height!! > maxHeight) maxHeight = height
        }

        return maxHeight * word.length
    }
}