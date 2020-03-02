package WordBreak

fun main() {
    val wordDictValid = mutableListOf(
        "leet",
        "code"
    )

    val wordDictValid2 = mutableListOf(
        "apple",
        "pan"
    )

    val wordDictInvalid = mutableListOf(
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
    wordDict.forEach { word ->
        if (s.contains(word)){

        }
    }
    return true
}
