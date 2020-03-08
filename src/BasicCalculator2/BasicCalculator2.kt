package BasicCalculator2

fun main() {
    val testCase1 = "3+2*2+2"
    val testCase2 = " 8/8-2 "
    val testCase3 = " 3+5 / 2 "
    val testcase4 = "7*7"
    println("calculator Cuk")
    println(calculate(testCase2))
}

fun calculate(s: String): Int {
    val q = mutableListOf<Char>()
    for (c in s.toCharArray()) {
        if (c != ' ') {
            q.add(c)
        }
    }
    q.add(' ')
    return helper(q)
}

fun helper(q: MutableList<Char>): Int {
    val queue = q
    var num = 0
    var prev = 0
    var sum = 0
    var prevOps = '+'

    while (queue.isNotEmpty()) {
        val c = queue[0]
        queue.removeAt(0)

        if (c in '0'..'9') {
            num = (num * 10).plus(c - '0')
        } else if (c == '(') {
            num = helper(queue)
        } else {
            when (prevOps) {
                '+' -> {
                    sum += prev
                    prev = num
                }
                '-' -> {
                    sum += prev
                    prev = -num
                }
                '*' -> {
                    prev *= num
                }
                '/' -> {
                    prev /= num
                }
            }

            if (c == ')') break

            num = 0
            prevOps = c
        }
    }

    return sum + prev
}