package IntersectionTwoArray

fun main() {
    val testCaseArr1 = intArrayOf(4, 9, 5)
    val testCaseArr2 = intArrayOf(9, 4, 9, 8, 4)

    println("Intesection Of Two Array")
    println("Result Is ${intersect(testCaseArr1, testCaseArr2)}")
}

/**
 * Iterative way
 * Time Complexcity : O(n2)
 */
fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val iteratorArr: MutableList<Int>
    val comparatorArr: MutableList<Int>
    if (nums1.size < nums2.size) {
        iteratorArr = nums1.toMutableList()
        comparatorArr = nums2.toMutableList()
    } else {
        iteratorArr = nums2.toMutableList()
        comparatorArr = nums1.toMutableList()
    }

    val mutableList = mutableListOf<Int>()

    for (item in iteratorArr) {
        for ((index2, item2) in comparatorArr.withIndex()) {
            if (item == item2) {
                mutableList.add(item)
                comparatorArr.removeAt(index2)
                break
            }
        }
    }
    return mutableList.toIntArray()
}