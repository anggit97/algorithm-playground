package LuckyNumberInMatrix

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
}