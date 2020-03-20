package LongestSubstring

fun main() {
    val s = "ababbca"
    val k = 2


    println("The longest substring : ")
    println(longestSubstring(s, k))
}

fun longestSubstring(s: String, k: Int): Int {
    val tempArr = mutableMapOf<Char, Int>()
    val resultArr = mutableMapOf<Char, Int>()

    for (char in s) {
        if (resultArr.contains(char).not()) {
            tempArr[char] = (tempArr[char]?.plus(1)) ?: 1
            tempArr[char]?.let { tempArrValue ->
                if (tempArrValue >= k) {
                    resultArr[char] = tempArrValue
                }
            }
        }else{
            resultArr[char] = (tempArr[char]?.plus(1)) ?: 1
        }
    }

    var count = 0
    resultArr.forEach {
        count += it.value
    }

    println(resultArr)

    return count
}