package ValidParentheses

/**
 * Complexity analysis
Time complexity : O(n)O(n) because we simply traverse the given string one character at a time and push and pop operations on a stack take O(1)O(1) time.
Space complexity : O(n)O(n) as we push all opening brackets onto the stack and in the worst case, we will end up pushing all the brackets onto the stack. e.g. ((((((((((.
 */
fun main() {
    val input = "{}[]"
    println("Is valid parathesis : ")
    println(isValidParentheses2(input))
}

fun isValidParentheses2(s: String): Boolean {
    val map: Map<String, String> = mapOf(
        Pair("]", "["),
        Pair("}", "{"),
        Pair(")", "(")
    )

    val stack: MutableList<String> = mutableListOf()

    //ex : {[]}
    s.forEach { char ->
        if (map.containsKey(char.toString())) {
            val topElement = if (stack.isEmpty()) {
                "#"
            } else {
                stack.last()
                stack.removeAt(stack.size - 1)
            }
            if (topElement != map[char.toString()]) return false
        } else {
            stack.add(char.toString())
        }
    }

    return true
}
