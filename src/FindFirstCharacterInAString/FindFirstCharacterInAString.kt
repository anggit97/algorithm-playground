package FindFirstCharacterInAString

fun main() {
    val testCaseWord = "leetcode"
    val testCaseWord2 = "loveleetcode"

    println("First Unique Character in $testCaseWord word is : ")
    println(firstUniqueChar(testCaseWord2))
}

fun firstUniqueChar(s: String): Int {
    val mutableMap = mutableMapOf<Char, Int>()
    val visited: MutableList<Char> = mutableListOf()
    for ((index, item) in s.withIndex()) {
        if (visited.contains(item)) {
            if (mutableMap.containsKey(item)) {
                mutableMap.remove(item)
            }
        } else {
            visited.add(item)
            mutableMap[item] = index
        }
    }
    return if (mutableMap.isEmpty()) -1 else mutableMap.entries.first().value
}
