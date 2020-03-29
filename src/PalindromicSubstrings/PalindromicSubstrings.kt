package PalindromicSubstrings

class PalindromicSubstrings {

    /**
     * O(n2) SUCK
     */
    fun countSubstrings(s: String): Int {
        val mutableList = mutableListOf<String>()
        var idx = 0

        for (item in s) {
            var start = ""
            for (index2 in idx until s.length) {
                start = start.plus(s[index2])
                mutableList.add(start)
            }
            idx++
        }

        var countPalindrom = 0
        mutableList.forEach {
            if (isPalindromeWithFunction(it)) countPalindrom++
        }

        return countPalindrom
    }

    private fun isPalindromeWithFunction(s: String): Boolean {
        val reverse = s.reversed().toCharArray()
        val notRevers = s.toCharArray()
        return notRevers.contentEquals(reverse)
    }



    /**
     * O(n)
     */
    fun countSubstringsV2(s: String): Int {
        var count = 1

        if (s.isEmpty())
            return 0
        for (i in 0 until s.length - 1) {
            count = checkPalindrome(s, i, i, count)     //To check the palindrome of odd length palindromic sub-string
            count = checkPalindrome(s, i, i + 1, count)   //To check the palindrome of even length palindromic sub-string
        }
        return count
    }

    private fun checkPalindrome(s: String, i: Int, j: Int, count: Int) : Int{
        var i = i
        var j = j
        var tempCount = count
        while (i >= 0 && j < s.length && s[i] == s[j]) {    //Check for the palindrome string
            tempCount++    //Increment the count if palindromin substring found
            i--    //To trace string in left direction
            j++    //To trace string in right direction
        }
        return tempCount
    }
}