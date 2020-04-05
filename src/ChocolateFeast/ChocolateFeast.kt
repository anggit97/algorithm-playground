package ChocolateFeast

class ChocolateFeast {

    fun chocolateFeast(n: Int, c: Int, m: Int): Int {
        //10 2 5
        var currentWrapper = n/c
        var remain: Int
        var countBar = currentWrapper

        while (currentWrapper >= m){
            remain = currentWrapper.rem(m)

            currentWrapper /= m

            countBar += currentWrapper

            currentWrapper += remain
        }

        return countBar
    }
}