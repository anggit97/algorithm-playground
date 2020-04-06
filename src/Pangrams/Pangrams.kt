package Pangrams

class Pangrams {

    fun pangrams(s: String): String {
        val alphabetMap = mutableMapOf<Char, Char>()
        for (char in 'a'..'z') {
            alphabetMap[char] = char
        }

        for (char in s.toLowerCase()) {
            if (alphabetMap.isEmpty()) return "pangram"

            if (alphabetMap.containsKey(char.toLowerCase())) {
                alphabetMap.remove(char)
            }
        }

        return if (alphabetMap.isEmpty()) "pangram" else "not pangram"
    }
}