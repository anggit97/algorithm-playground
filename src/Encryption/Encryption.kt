package Encryption

import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.sqrt

class Encryption {

    fun encryption(s: String): String {
        val mutableList = mutableListOf<MutableList<String>>()

        val trimAndReplaceText = s.trim().replace(" ", "")
        val lengthText = trimAndReplaceText.length
        val resultRoot = sqrt(lengthText.toDouble())
        val bottomResult = floor(resultRoot).toInt()
        val topResult = ceil(resultRoot).toInt()

        var count = 0
        var m = mutableListOf<String>()
        for ((index, item) in trimAndReplaceText.withIndex()) {
            m.add(item.toString())
            if (count == bottomResult || index == trimAndReplaceText.length-1) {
                mutableList.add(m)
                m = mutableListOf()
                count = 0
                continue
            }
            count++
        }


        var resultString = ""
        for (index in 0 until topResult) {
            for (index2 in 0 until bottomResult){
                resultString = resultString.plus(mutableList[index2][index])
            }
            resultString = resultString.plus(" ")
        }

        return resultString.trim()
    }
}