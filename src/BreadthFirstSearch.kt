/**
 * This Algorithm is to check what is all node is visit or not, if not we need to make another graph
 * cases :
 * 0 -> 1
 *   -> 2
 */
fun main() {
    val bfs = Graph(4)

    bfs.addEdge(0, 1);
    bfs.addEdge(0, 2);
    bfs.addEdge(1, 2);
    bfs.addEdge(2, 0);
    bfs.addEdge(2, 3);
    bfs.addEdge(3, 3);

    println("Here are our BFS, starting from vertex 2")
    bfs.BFS(2)
}


class Graph(val Vertex: Int) {

    private var adj: MutableList<MutableList<Int>> = mutableListOf()

    init {
        for (i in 0 until Vertex) {
            adj.add(mutableListOf())
        }
    }

    fun addEdge(v: Int, w: Int) {
        adj[v].add(w)
    }

    fun BFS(s: Int) {
        val visited = BooleanArray(Vertex)

        val queue: MutableList<Int> = mutableListOf()

        visited[s] = true
        queue.add(s)
        while (queue.isNotEmpty()) {
            val value = queue.first()
            queue.removeAt(0)

            print(value.toString())

            val iterator: Iterator<Int> = adj[value].listIterator()
            while (iterator.hasNext()) {
                val n = iterator.next()
                if (visited[n].not()) {
                    visited[n] = true
                    queue.add(n)
                }
            }
        }
    }
}
