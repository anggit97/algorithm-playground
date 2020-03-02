package SingleNumber

fun main() {
    val testCase = intArrayOf(4, 1, 2, 1, 2)

    println("Single Number Of arr : ")
    println(singleNumber(testCase))
}

/**
 * List Operation Approach
 * Time Complexity : O(n2), because we put search command inside loop
 */
fun singleNumber(sortedNums: IntArray): Int {
    val stack = mutableListOf<Int>()
    val alreadyMarkAsDoubled = mutableListOf<Int>()
    sortedNums.forEach {
        if (!stack.contains(it)) {
            if (alreadyMarkAsDoubled.contains(it).not()) {
                stack.add(it)
            }
        } else {
            alreadyMarkAsDoubled.add(it)
            stack.remove(it)
        }
    }

    return stack[0]
}

/**
 * Hash Table Approach
 * Time Complexity : O(n), because we reduce code to search value inside loop
 */
fun singleNumberWithHashMap(nums: IntArray): Int {
    val hashTable = mutableMapOf<Int, Int>()
    for ((index, item) in nums.withIndex()) {
        try {
            hashTable.remove(item)
        } catch (e: Throwable) {
            hashTable[index] = item
        }
    }

    println(hashTable.toString())

    return 0
}
