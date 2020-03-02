package AddTwoNumber

fun main(){
    //[2,4,3]
    val l11 = ListNode(2)
    val l12 = ListNode(4)
    val l13 = ListNode(3)

    l11.next = l12
    l12.next = l13

    //[5,6,4]
    val l21 = ListNode(5)
    val l22 = ListNode(6)
    val l23 = ListNode(4)

    l21.next = l22
    l22.next = l23


    //assert
    addTwoNumbers(l11, l21)
}

/**
 * The pseudocode is as following:
-Initialize current node to dummy head of the returning list.
-Initialize carry to 0.
-Initialize p and q to head of l1 and l2 respectively.
-Loop through lists l1 and l2 until you reach both ends.
-Set x to node p's value. If p has reached the end of l1, set to 0.
-Set y to node q's value. If q has reached the end of l2, set to 0.
-Set sum = x + y + carry
-Update carry = sum / 10.
-Create a new node with the digit value of (sum \bmod 10) and set it to current node's next, then advance current node to next.
Advance both pp and qq.
-Check if carry = 1, if so append a new node with digit 11 to the returning list.
-Return dummy head's next node.

Complexity Analysis
Time complexity : O(max(m,n)). Assume that m and n represents the length of l1 and l2 respectively, the algorithm above iterates at most max(m,n) times.
Space complexity : O(max(m,n)). The length of the new list is at most max(m,n)+1.
 */
fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    val dummyHead = ListNode(0)
    var p = l1
    var q = l2
    var curr = dummyHead
    var carry = 0
    while((p != null).or(q != null)){
        val x = p?.`val` ?: 0
        val y = q?.`val` ?: 0
        val sum = carry + x + y
        carry = sum.div(10)
        curr.next = ListNode(sum.rem(10))
        curr = curr.next!!
        if(p != null) p = p.next
        if(q != null) q = q.next
    }
    if(carry > 0){
        curr.next = ListNode(carry)
    }
    return dummyHead.next
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}