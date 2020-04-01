package SymmetricTree

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
fun main() {
    val treeNode = TreeNode(1).also { it ->
        it.left = TreeNode(2).also {
            it.left = TreeNode(3)
            it.right = TreeNode(4)
        }
        it.right = TreeNode(2).also {
            it.left = TreeNode(3)
            it.right = TreeNode(4)
        }
    }

    println("Is Symmetric : ")
    println(isSymmetric(treeNode))
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun isSymmetric(root: TreeNode): Boolean {
    return false
}