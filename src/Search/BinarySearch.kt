package Search

/**
 * Time Complexity T(n) = T(n/2) + c
 */
fun main() {
    val sampleArr = intArrayOf(1, 4, 2, 3, 3)
    val searchNumber = 3
    println("Search Number is : $searchNumber")
    println(binarySearch(sampleArr, searchNumber))
}

/**
 * How :
 * 1. Compare the search number with x (the middle of array)
 */
fun binarySearch(arr: IntArray, searchNumber: Int): Boolean {
    val remainArr = arr.sorted().toMutableList()
    var endIndex: Int
    while (remainArr.isNotEmpty()) {
        val middleIndex = remainArr.size.div(2)
        val middleNumber = remainArr[middleIndex]
        endIndex = remainArr.size - 1
        when {
            searchNumber > middleNumber -> {
                remainArr.removeRange(IntRange(0, middleIndex))
            }
            searchNumber < middleNumber -> {
                remainArr.removeRange(IntRange(middleIndex, endIndex))
            }
            else -> return true
        }
    }
    return false
}

fun binarySearchIndex(arr: IntArray, searchNumber: Int): Int {
    val remainArr = arr.sorted().toMutableList()
    var endIndex: Int
    while (remainArr.isNotEmpty()) {
        val middleIndex = remainArr.size.div(2)
        val middleNumber = remainArr[middleIndex]
        endIndex = remainArr.size - 1
        when {
            searchNumber > middleNumber -> {
                remainArr.removeRange(IntRange(0, middleIndex))
            }
            searchNumber < middleNumber -> {
                remainArr.removeRange(IntRange(middleIndex, endIndex))
            }
            else -> return middleIndex
        }
    }
    return 0
}

inline fun <reified T> MutableList<T>.removeRange(range: IntRange) {
    val fromIndex = range.first
    val toIndex = range.last
    val filtered = filterIndexed { i, t -> i < fromIndex || i > toIndex }
    clear()
    addAll(filtered)
}
