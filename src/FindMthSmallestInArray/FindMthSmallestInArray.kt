package FindMthSmallestInArray

fun main() {
    val testCaseArray = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(2, 4, 6),
        intArrayOf(0, 9, 10, 11)
    )

    val testCaseArray2 = arrayOf(
        intArrayOf(1, 3, 20),
        intArrayOf(2, 4, 6)
    )

    val m = 5

    println("Find the smallest $m-th in array : ")
    println(findMthSmallestValueSmallestKShortestArray(testCaseArray2, m))
}

fun findMthSmallestValueSmallestKShortestArray(
    testCaseArray: Array<IntArray>,
    m: Int
): Int {
    val result = mutableListOf<Int>()
    for (arr in testCaseArray) {
        arr.forEach {
            result.add(it)
        }
    }
    val sortedArray = result.sorted()
    return sortedArray[m-1]
}