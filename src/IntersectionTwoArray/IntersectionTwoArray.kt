package IntersectionTwoArray

fun main() {
    val testCaseArr1 = intArrayOf(1,2,2,1)
    val testCaseArr2 = intArrayOf(2,2)

    println("Intesection Of Two Array")
    println("Result Is ${intersect(testCaseArr1, testCaseArr2)}")
}

/**
 * Iterative way
 * Time Complexcity : O(n2)
 */
fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val iteratorArr: IntArray
    val comparatorArr: IntArray
    if (nums1.size < nums2.size) {
        iteratorArr = nums1
        comparatorArr = nums2
    } else {
        iteratorArr = nums2
        comparatorArr = nums1
    }

    val mutableList = mutableListOf<Int>()

    for (item in iteratorArr) {
        for (item2 in comparatorArr) {
            if (item == item2) {
//                if (mutableList.contains(item)) break
                mutableList.add(item)
                break
            }
        }
    }
    println(mutableList)
    return mutableList.toIntArray()
}