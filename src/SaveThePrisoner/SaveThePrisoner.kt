package SaveThePrisoner

class SaveThePrisoner {

    fun saveThePrisoner(n: Int, m: Int, s: Int): Int {
        var treat = m
        var result = s-1
        while (treat > 0){
            if (result > n) result = s-1
            result += 1
            treat--
        }
        return result
    }
}