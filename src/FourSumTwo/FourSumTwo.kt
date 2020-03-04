package FourSumTwo

fun main() {
    val arrA = intArrayOf(-1, -1)
    val arrB = intArrayOf(-1, 1)
    val arrC = intArrayOf(-1, 1)
    val arrD = intArrayOf(1, -1)

    println("For Sum Two Result : ")
    println(fourSumCountHashMap(arrA, arrB, arrC, arrD).toString())
}

/**
 * O(n^4) => Time Limit Exception
 */
fun fourSumCountBruteForce(A: IntArray, B: IntArray, C: IntArray, D: IntArray): Int {
    var sum = 0
    A.forEach { a ->
        B.forEach { b ->
            C.forEach { c ->
                D.forEach { d ->
                    val result = a + b + c + d
                    if (result == 0) sum++
                }
            }
        }
    }
    return sum
}

/**
 * O(n^2)
 */
fun fourSumCountHashMap(A: IntArray, B: IntArray, C: IntArray, D: IntArray): Int {
    val mutableMap = mutableMapOf<Int, Int>()
    var sum = 0

    for (item1 in C) {
        for (item2 in D) {
            val sumVal = item1 + item2
            mutableMap[sumVal] = mutableMap.getOrDefault(sumVal, 0) + 1
        }
    }

    println(mutableMap.toString())

    for (item1 in A) {
        for (item2 in B) {
            val sumVal = item1 + item2
            sum += mutableMap.getOrDefault(-sumVal, 0)
        }
    }

    println(mutableMap.toString())

    return sum
}
