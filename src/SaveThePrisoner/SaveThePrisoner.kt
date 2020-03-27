package SaveThePrisoner

class SaveThePrisoner {

    fun saveThePrisoner(n: Int, m: Int, s: Int): Int {
        var treat = m
        var result = s - 1
        while (treat > 0) {
            if (result > n) result = s - 1
            result += 1
            treat--
        }
        return result
    }

    fun saveThePrisonerV2(n: Int, m: Int, s: Int): Int {
        val result: Int
        val diffNumber1 = s - 1
        val calc = m.rem(n)
        result = calc + diffNumber1
        return result
    }

    fun saveThePrisonerV3(n: Int, m: Int, s: Int): Int {
        val a = s + m - 1
        if (a > n) {
            if (a % n == 0) {
                return n
            }
            return a % n
        }

        return a
    }
}