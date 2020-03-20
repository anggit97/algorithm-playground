package FindDuplicateNumber

//fun main() {
//    val testCase = intArrayOf(1, 3, 4, 2, 2)
//    val testCase2 = intArrayOf(3, 1, 3, 4, 2)
//    println("Find duplicate number")
//    println("Duplicate number ${findDuplicate(testCase2)}")
//}

class FindDuplicateNumber {

    fun findDuplicate(nums: IntArray): Int {
        val visited = mutableMapOf<Int, Int>()
        for (item in nums) {
            if (visited.containsKey(item)) {
                return item
            } else {
                visited[item] = 1
            }
        }
        return -1
    }
}