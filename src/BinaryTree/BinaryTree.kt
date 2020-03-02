package BinaryTree

fun main() {

}

class Node(val `val`: Int) {
    var left: Node? = null
    var right: Node? = null
}

/**
 *
 * Tree is a hierarchical data structure. Main uses of trees include maintaining hierarchical data,
 * providing moderate access and insert/delete operations.
 * Binary trees are special cases of tree where every node has at most two children.
 *
tree
----
      1    <-- root
    /   \
   2     3
  /
 4
 */
fun createBinaryTree(){
    val root = Node(1).also { it ->
        it.left = Node(2).also {
            it.left = Node(4)
        }
        it.right = Node(3)
    }
}


/**
 * 1) Maximum number of node express as 2^(i-1), where i is level.
 * root is level 1, so
 * 2^(1-1) = 2^0 = 1
 *
 * 2) Maximum number of node express as (2^h) - 1, where h is level
 * level 3, so
 * (2^3) - 1 = 7
 *
 * 3) In a Binary Tree with N nodes, minimum possible height or minimum number of levels is  Log2(N+1)?
 */
