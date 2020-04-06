package LisaWorkbook

class LisaWorkbook {

    fun workbook(n: Int, k: Int, arr: Array<Int>): Int {
        var index = 1
        var specialCasesCount = 0

        for (num in arr) {
            for (valueArr in 1..num) {
                if (valueArr == index) specialCasesCount++
                if (valueArr.rem(k) == 0 && valueArr != 1 && valueArr != num) index++
            }
            index++
        }

        return specialCasesCount
    }
}