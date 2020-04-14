package CaesarCipher

class CaesarChiper {

    //middle-Outz
    fun caesarCipher(s: String, k: Int): String {
        val result = mutableListOf<Char>()

        for (char in s) {
            if (char == '-' || char == '_') {
                result.add(char)
                continue
            }

            if (char == 'z' || char == 'Z'){
                continue
            }

            val chipper = char + k
            result.add(chipper)
        }

        return result.joinToString()
    }
}