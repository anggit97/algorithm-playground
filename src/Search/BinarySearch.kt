package Search

fun main() {
    val sampleArr = intArrayOf(1, 3, 2, 10, 5, 23, 16, 7, 4)
    val searchNumber = 7
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

inline fun <reified T> MutableList<T>.removeRange(range: IntRange) {
    val fromIndex = range.first
    val toIndex = range.last
    val filtered = filterIndexed { i, t -> i < fromIndex || i > toIndex }
    clear()
    addAll(filtered)
}
