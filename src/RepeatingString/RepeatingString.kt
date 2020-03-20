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
}