package ValidPalindrome

fun main() {
    val testCase = "wdawd"
    println("Is Palindrome")
    println(isPalindrom(testCase))
}

fun isPalindromeWithFunction(s: String): Boolean {
    val reverse = s.reversed().toCharArray()
    val notRevers = s.toCharArray()
    return notRevers.contentEquals(reverse)
}


/**
 * Time Complexity : O(n)
 */
fun isPalindrom(s: String): Boolean {
    val regex = Regex("[^A-Za-z0-9]")
    val sArr = s.toLowerCase()
        .replace(regex, "")
        .toCharArray()
    var i = 0
    var j = sArr.size - 1
    while (i < sArr.size) {
        if (sArr[i] != sArr[j]) return false
        i++
        j--
    }
    return true
}
