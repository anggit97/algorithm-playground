package RepeatingString

class RepeatingString {

    fun repeatedString(s: String, n: Long): Long {
        val tempInput = s.toCharArray().toMutableList()
        var countA: Long = 0

        if (s == "a") return n

        for (index in 0 until n) {
            val tempC = tempInput[0]

            tempInput.removeAt(0)
            tempInput.add(tempC)

            if (tempC == 'a') countA++
        }

        return countA
    }

    fun repeatedString2(s: String, n: Long): Long {
        var count: Long = 0

        var i = 0
        while (i < s.length) {
            if (s[i] == 'a')
                count++
            i++
        }

        val div = n.div(s.length)
        val reminder = n.rem(s.length)

        count *= div

        i = 0
        while (i < reminder) {
            if (s[i] == 'a')
                count++
            i++
        }

        return count
    }
}