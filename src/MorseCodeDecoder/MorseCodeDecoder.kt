package MorseCodeDecoder

class MorseCodeDecoder {

    fun decodeMorse(code: String): String {

        val result = mutableListOf<String>()
        val wordArr = code.split("  ")

        for (word in wordArr){
            for (char in word.split(" ")){
                if (MorseCodeDataSource.getMorseCode().containsKey(char)){
                    result.add(MorseCodeDataSource.getMorseCode()[char]!!)
                }
            }
            result.add(" ")
        }

        return result.joinToString("").trim()
    }
}