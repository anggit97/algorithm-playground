package BetweenTwoNumbers

class BetweenTwoNumbers {

    fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
        val lcp = mutableListOf<Int>()
        val result = mutableListOf<Int>()
        val maxA = a.max()!!
        val minB = b.min()!!


        //gcp
        for (num in maxA..minB) {
            var flag = true

            for (numA in a) {
                if (num.rem(numA) != 0) {
                    flag = false
                    break
                }
            }

            if (flag) {
                lcp.add(num)
            }
        }


        //lcp
        for (num in lcp){
            var flag = true
            for (numB in b){
                if (numB.rem(num) != 0){
                    flag = false
                    break
                }
            }

            if (flag){
                result.add(num)
            }
        }

        return result.size
    }
}