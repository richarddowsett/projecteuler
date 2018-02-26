import util.Stack

object BalancedString {

  def isStringBalanced(in: List[Char], square: Stack[String] = Stack.empty[String], curly: Stack[String] = Stack.empty[String]): Boolean = {
    if (in.isEmpty) {
      square.isEmpty && curly.isEmpty
    } else {

      in.head match {
        case '{' => isStringBalanced(in.tail, square, curly.push(""))
        case '}' => isStringBalanced(in.tail, square, curly.pop()._2)
        case '[' => isStringBalanced(in.tail, square.push(""), curly)
        case ']' => isStringBalanced(in.tail, square.pop()._2, curly)
      }
    }

  }

  implicit class IsBalanced(s:String) {
    def isBalanced():Boolean = isStringBalanced(s.toList)
  }

}
