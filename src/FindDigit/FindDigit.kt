package FindDigit

class FindDigit {

    fun findDigits(n: Int): Int {
        var sum = 0
        for (char in n.toString()) {
            val number = char.toString().toInt()
            if (number == 0) continue
            if (n.rem(number) == 0) sum += 1
        }
        return sum
    }
}