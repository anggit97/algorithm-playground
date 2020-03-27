package PalindromicSubstrings

class PalindromicSubstrings {

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
}