package FizzBuzz

fun main() {
    val testCaseNumber = 15

    println("Here is my Fizz Buzz")
    println(fizzBuzz(testCaseNumber).toString())
}

/**
 * O(n)
 */
fun fizzBuzz(n: Int): List<String> {
    val result = mutableListOf<String>()
    for (i in 1..n) {
        val res: String = when {
            (i.rem(3) == 0) and (i.rem(5) == 0) -> "FizzBuzz"
            i.rem(3) == 0 -> "Fizz"
            i.rem(5) == 0 -> "Buzz"
            else -> i.toString()
        }
        result.add(res)
    }
    return result
}