/**
 * Using BFS (Breadth First Search) for a graph
 * Rule:
 * => We need to find neighbour of given word to wordlist,
 * => we need to the shortest differ by one letter
 * ex : beginWord => HIT, endWord => COG
 * HIT -> HOT ->
 *
 * STEP:
 * 1. do preprocessing wordlist, make to be generic, ex: HOT
 *  a) *HOT
 *  b) H*T
 *  c) HO*
 * 2.
 */
fun main() {
    val wordList = listOf("hot", "dot", "dog", "lot", "log", "cog")
    val beginWord = "hit"
    val endWord = "cog"

    print("Ledder Length ${ladderLength(beginWord, endWord, wordList)}")
}

fun ladderLength(beginWord: String, endWord: String, wordList: List<String>): Int {
    val length = beginWord.length

    //To store combination of word to generic word ex Hot => H*t, *ot, Ho*
    val allComboDict: MutableMap<String, MutableList<String>> = mutableMapOf()

    //Do pre processing from word to generic word
    wordList.forEach { word ->
        for (i in 0 until length) {
            val newWord = word.substring(0, i).plus("*").plus(word.substring(i + 1, length))

            val transformations: MutableList<String> = allComboDict.getOrDefault(newWord, mutableListOf())
            transformations.add(word)
            allComboDict[newWord] = transformations
        }
    }

    //Queue For FBS
    val queue: MutableList<Pair<String, Int>> = mutableListOf()
    queue.add(Pair(beginWord, 1))

    //visitted to make sure we dont repeated visiting
    val visitted: MutableMap<String, Boolean> = mutableMapOf()
    visitted[beginWord] = true

    while (queue.isNotEmpty()) {
        val node = queue.removeAt(0)
        val word = node.first
        val level = node.second
        for (i in 0 until length) {
            val newWord = word.substring(0, i).plus("*").plus(word.substring(i + 1, length))
            for (adjacentWord in allComboDict.getOrDefault(newWord, mutableListOf())) {
                if (adjacentWord == newWord) return level.plus(1)

                if (visitted.containsKey(adjacentWord).not()) {
                    visitted[adjacentWord] = true
                    queue.add(Pair(adjacentWord, level + 1))
                }
            }
        }
    }
    return 0
}


