package BackwardReadPrimes

class BackwardReadPrimes {

    fun backwardsPrime(start: Long, end: Long): String {
        var result = ""

        for (i in start..end) {
            val reversePrimeNumber = i.toString().reversed().toLong()

            if (i.toString().length == 1 || reversePrimeNumber.toString().length == 1) continue

            if (i == reversePrimeNumber) continue

            if (!isPrimeNumber(i) || !isPrimeNumber(reversePrimeNumber)) continue

            result += " $i"
        }

        return result.trim()
    }

    fun isPrimeNumber(number: Long): Boolean {
        for (i in 2..number / 2) {
            if (number % i == 0L) {
                return false
            }
        }
        return true
    }
}