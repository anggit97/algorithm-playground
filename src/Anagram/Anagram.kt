package Anagram

class Anagram {

    /**
     * Time Complexity : O(n2)
     */
    fun isAnagram(word1: String, word2: String): Boolean {
        if (word1.length != word2.length) return false

        val sortingWord1 = word1.toCharArray().sortedArrayDescending()
        val sortingWord2 = word2.toCharArray().sortedArrayDescending()

        return sortingWord1.contentEquals(sortingWord2)
    }
}