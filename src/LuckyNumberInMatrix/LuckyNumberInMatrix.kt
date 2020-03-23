package LuckyNumberInMatrix

class LuckyNumberInMatrix {

    fun luckyNumbers(matrix: Array<IntArray>): List<Int> {
        //Sort All Sub Array
        for ((index, item) in matrix.withIndex()) {
            matrix[index] = matrix[index].sortedArray()
        }


        return listOf(matrix[matrix.size - 1][0])
    }
}