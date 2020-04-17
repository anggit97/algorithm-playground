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
        return if (number.rem(2L) != 0L){
            number.rem(3L) != 0L && number.rem(5L) != 0L && number.rem(7L) != 0L
        }else{
            false
        }
    }
}