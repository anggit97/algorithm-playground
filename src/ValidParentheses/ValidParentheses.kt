package ValidParentheses

fun main() {
    val input = "{[)}"
    println("Is valid parathesis : ")
    println(isValidParentheses(input))
}

fun isValidParentheses(s: String): Boolean {
    val map: Map<String, String> = mapOf(
        Pair("[", "]"),
        Pair("{", "}"),
        Pair("(", ")")
    )

    val sArr = s.toCharArray()
    var j = sArr.size - 1
    for (i in 0 until sArr.size / 2) {
        val pairVal1 = map.getValue(sArr[i].toString())
        val closeParenthasis = sArr[j].toString()
        if (pairVal1 != closeParenthasis) return false
        j--
    }
    return true
}
