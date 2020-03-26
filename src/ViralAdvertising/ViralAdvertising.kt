package ViralAdvertising

import kotlin.math.floor

class ViralAdvertising {

    fun viralAdvertising(n: Int): Int {
        if (n == 0) return 0

        var recipient = 5
        var sum = 0

        for (i in 0 until n){
            recipient = floor(recipient.div(2).toDouble()).toInt()
            sum += recipient
            recipient *= 3
        }

        return sum
    }
}