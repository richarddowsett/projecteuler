package euler

import euler.Tree.{Node}


case class Tree(leaf: Node) {


}

object Tree  {

  case class Node(value: Int, var left: Option[Node], var right: Option[Node])

  object Node {
  }

  def apply(ts: List[Int]): Tree = {
    val head = Node(ts.head, None, None)
    ts.tail.foreach(t => {
      var modified: Boolean = false
      var current = head
      while (!modified) {

        if (current.left.exists(c => t < c.value)) {
          current = current.left.get
        }
        if (current.right.exists(c => t > c.value)) {
          current = current.right.get
        }
        if (t < current.value) {
          current.left = Option(Node(t, Option.empty[Node], None))
          modified = true
        }
        else {
          current.right = Option(Node(t, None, None))
          modified = true
        }
      }
    }

    )
    Tree(head)
  }


}


