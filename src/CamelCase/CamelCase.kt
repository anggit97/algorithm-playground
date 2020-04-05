package CamelCase

class CamelCase {

    fun camelcase(s: String): Int {
        if (s.isEmpty()) return 0

        var countWord = 1

        for (str in s) {
            if (str.isUpperCase()) countWord++
        }

        return countWord
    }
}