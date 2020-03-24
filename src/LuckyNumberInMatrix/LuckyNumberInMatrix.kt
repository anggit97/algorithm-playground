package LuckyNumberInMatrix

import kotlin.math.max
import kotlin.math.min

class LuckyNumberInMatrix {

    fun luckyNumbers(matrix: Array<IntArray>): List<Int> {
        //Sort All Sub Array
        for ((index, item) in matrix.withIndex()) {
            matrix[index] = matrix[index].sortedArray()
        }

        var maxNumber = matrix[0][0]
        var maxNumberIndexColumn = 0

        //Get All Possible Maximum Element in Column 0
        for ((index, item) in matrix.withIndex()) {
            if (maxNumber < item[0]) {
                maxNumber = item[0]
                maxNumberIndexColumn = index
            }
        }

        return listOf(matrix[maxNumberIndexColumn][0])
    }

    fun luckyNumberFindAllPossible(matrix: Array<IntArray>): List<Int> {
        val m = matrix.size
        val n = matrix[0].size
        val mi = IntArray(m)
        val mx = IntArray(n)

        var k = 0
        repeat(mi.count()) {
            mi[k] = Int.MAX_VALUE
            k++
        }

        for (i in 0 until m) {
            for (j in 0 until n) {
                mi[i] = min(matrix[i][j], mi[i])
                mx[j] = max(matrix[i][j], mx[j])
            }
        }

        val res = mutableListOf<Int>()
        for (i in 0 until m)
            for (j in 0 until n)
                if (mi[i] == mx[j])
                    res.add(mi[i])

        return res
    }
}