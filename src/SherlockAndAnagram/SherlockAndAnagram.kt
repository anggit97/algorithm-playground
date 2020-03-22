package SherlockAndAnagram

class SherlockAndAnagram {

    fun sherlockAndAnagrams(s: String): Int {
        var cnt = 0
        var i = 1
        val n = s.length
        while (i < n) {
            val subsetList = mutableListOf<String>()
            for (j in 0 until n) {
                if (i + j <= n) {
                    subsetList.add(s.substring(j, i + j))
                }
            }

            var k = 0
            val size = subsetList.size
            while (k < size) {
                for (l in k + 1 until size) {
                    if (isAnagram(subsetList[k], subsetList[l])) {
                        cnt++
                    }
                }
                k++
            }
            i++
        }

        return cnt
    }

    private fun isAnagram(word1: String, word2: String): Boolean {
        if (word1.length != word2.length) return false

        val sortingWord1 = word1.toCharArray().sortedArrayDescending()
        val sortingWord2 = word2.toCharArray().sortedArrayDescending()

        return sortingWord1.contentEquals(sortingWord2)
    }
}