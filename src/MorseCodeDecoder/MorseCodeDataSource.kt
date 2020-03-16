package MorseCodeDecoder

object MorseCodeDataSource {
    fun getMorseCode() : MutableMap<String, String>{
        val morseCodeDic = mutableMapOf<String, String>()
        morseCodeDic[".-"] = "A"
        morseCodeDic["-..."] = "B"
        morseCodeDic["-.-."] = "C"
        morseCodeDic["-.."] = "D"
        morseCodeDic["."] = "E"
        morseCodeDic["..-."] = "F"
        morseCodeDic["--."] = "F"
        morseCodeDic["...."] = "H"
        morseCodeDic[".."] = "I"
        morseCodeDic[".---"] = "J"
        morseCodeDic["-.-"] = "K"
        morseCodeDic[".-.."] = "L"
        morseCodeDic["--"] = "M"
        morseCodeDic["-."] = "N"
        morseCodeDic["---"] = "O"
        morseCodeDic[".--."] = "P"
        morseCodeDic["--.-"] = "Q"
        morseCodeDic[".-."] = "R"
        morseCodeDic["..."] = "S"
        morseCodeDic["-"] = "T"
        morseCodeDic["..-"] = "U"
        morseCodeDic["...-"] = "V"
        morseCodeDic[".--"] = "W"
        morseCodeDic["-..-"] = "X"
        morseCodeDic["-.--"] = "Y"
        morseCodeDic["--.."] = "Z"
        return morseCodeDic
    }
}