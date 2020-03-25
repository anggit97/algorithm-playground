package AngryProfessor

class AngryProfessor {

    fun angryProfessor(k: Int, a: Array<Int>): String {
        a.sort()

        var sumNotLateUser = 0
        a.forEach {
            if (it <= 0) sumNotLateUser +=1
            if (sumNotLateUser >= k) return "NO"
        }

        return "YES"
    }
}