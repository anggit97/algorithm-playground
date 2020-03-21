package HourGlassSum

class HourGlassSum {

    // Complete the hourglassSum function below.
    /**
     * O(n2)
     */
    fun hourglassSum(arr: Array<Array<Int>>): Int {
        val sumlist = mutableListOf<Int>()
        val iteration = arr.size - 2
        for (i in 0 until iteration) {
            for (j in 0 until iteration) {
                val topleft = arr[i][j]
                val topCenter = arr[i][j + 1]
                val topRight = arr[i][j + 2]

                val center = arr[i + 1][j + 1]

                val bottomLeft = arr[i + 2][j]
                val bottomCenter = arr[i + 2][j + 1]
                val bottomRight = arr[i + 2][j + 2]

                val sum = topleft + topCenter + topRight + center + bottomLeft + bottomCenter + bottomRight

                sumlist.add(sum)
            }
        }
        return sumlist.max()!!
    }
}