package SumOfTwoIntegers

/**
 * Case: Adding 2 number without operator '+' or '-'
 * How : Using 'Bit Manipulation'
 */
fun main() {
    val value1 = 3
    val value2 = 2

    println("Sum Of Two Integer : ")
    println(sumNumberRecursively(value1, value2))
}

/**
 * Iterative way
 */
fun sumNumbers(a: Int, b: Int): Int {
    var tempA = a
    var tempB = b

    if (tempA == 0) return tempB
    if (tempB == 0) return tempA

    while (tempB != 0) {
        val carry = tempA.and(tempB)
        tempA = tempA.xor(tempB)
        tempB = carry.shl(1)
    }
    return tempA
}

/**
 * Recursive Way
 */
fun sumNumberRecursively(a: Int, b: Int) : Int{
    return if (b == 0) a else sumNumberRecursively(a.xor(b), (a.and(b)).shl(1))
}
