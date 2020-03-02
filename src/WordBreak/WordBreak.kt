package WordBreak

fun main() {
    val wordDictValid = mutableListOf<String>(
        "leet",
        "code"
    )

    val wordDictValid2 = mutableListOf<String>(
        "apple",
        "pan"
    )

    val wordDictInvalid = mutableListOf<String>(
        "cats",
        "dog",
        "sand",
        "and",
        "cat"
    )

    val wordTest = "leetcode"

    println("Is Word Break")
    println(wordBreaks(wordTest, wordDictValid))
}

fun wordBreaks(s: String, wordDict: MutableList<String>): Boolean {
    return true
}
