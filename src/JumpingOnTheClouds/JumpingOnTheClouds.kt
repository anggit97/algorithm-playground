package JumpingOnTheClouds

class JumpingOnTheClouds {

    /**
     * O(n)
     */
    fun jumpingOnClouds(c: Array<Int>): Int {
        var tempComulus = 0
        var step = 0
        c.forEach {
            if (it == 0) {
                tempComulus += 1
            }
            if (it == 1) {
                step += 1
                tempComulus = 0
            }
            if (tempComulus == 2) {
                step += 1
                tempComulus = 0
            }
        }
        return step
    }
}