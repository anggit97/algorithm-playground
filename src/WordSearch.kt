/**
 * Test Case
 * https://www.programcreek.com/2014/06/leetcode-word-search-java/
 * [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]]
 *
 * using : DFS (Deep First Search)
 */
fun main() {
    val testCaseArr = arrayOf(
        charArrayOf('A', 'B', 'C', 'E'),
        charArrayOf('S', 'F', 'C', 'S'),
        charArrayOf('A', 'D', 'E', 'E')
    )

    printinput(testCaseArr)

    val testCaseWord = "ABC"

    print(exists(testCaseArr, testCaseWord))
}

fun printinput(testCaseArr: Array<CharArray>) {
    println("Input")
    println("[")
    testCaseArr.forEach { it ->
        print("[")
        it.forEach {
            print(it)
        }
        print("]")
        println()
    }
    println("]")
}

fun exists(board: Array<CharArray>, word: String): Boolean {
    //get length of column
    val m = board.size
    //get length of row
    val n = board[0].size
    //set initial result value
    var result = false

    //Loop through (column, row)
    for (i in 0 until m) {
        for (j in 0 until n) {
            //check if word in board is found, k is length of target word
            if (dfs(board, word, i, j, 0)) result = true
        }
    }

    return result
}

fun dfs(board: Array<CharArray>, word: String, i: Int, j: Int, k: Int): Boolean {
    val m = board.size
    val n = board[0].size

    //Check if its not out of bound of array
    if (i < 0 || j < 0 || i >= m || j >= n) return false

    //Check if char in word exists in board (i,j)
    if (board[i][j] == word[k]) {
        //store in temp var
        val temp = board[i][j]
        //mark as visitted
        board[i][j] = '#'
        //check if it in last char in target word
        if (k == word.length - 1) {
            return true
        } else if (
            dfs(board, word, i - 1, j, k + 1)
            || dfs(board, word, i + 1, j, k + 1)
            || dfs(board, word, i, j - 1, k + 1)
            || dfs(board, word, i, j + 1, k + 1)
        ) {
            return true
        }
        //if weare not get what we are looking at, just bring back board value
        board[i][j] = temp
    }
    return false
}

/**
Pseudocode SEE:
=> add into hash table for searching char
=> format <word, index>
=> (s, 10), (s, 13), (e, 03), (e, 22), (e, 23)
=> buat variable tempConstract, untuk tampung constract wordnya
=> s1 (a, 10), map ke setiap e, nilai false
=> s2 (s, 13), map ke setiap e, nilai true e3(e, 23)
=> e3 (e, 23), mep ke setiap e, nilai true e2(e, 22)
=> return true

example input :
board =
[
['A','B','C','E'],
['S','F','C','S'],
['A','D','E','E']
]

Given word = "ABCCED", return true.
Given word = "SEE", return true.
Given word = "ABCB", return false.
 */


