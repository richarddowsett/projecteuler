package euler

/**
  * Created by Richard on 01/02/2018.
  */
object Calculator extends App {

  def calculate(input: String): Int = {
    calculate(input.toList)
  }

  def calculate(list: List[Char], i: Int = 0): Int = {
    list match {
      case x :: xs if x == ')' => calculate(xs, i)
      case x :: xs if x == '(' => val sum = calculate(xs.takeWhile(_ != ')'), i)
        calculate(list.dropWhile(_ != ')'), sum)
      case x :: xs if x.isDigit => val digit = list.takeWhile(_.isDigit).map(_.asDigit).foldLeft("")(_ + _).toInt
        calculate(list.dropWhile(_.isDigit), digit)
      case x :: xs if x == '+' => i + nextDigit(xs)
      case x :: xs if x == '*' => i * nextDigit(xs)
      case x :: xs if x == '-' => i - nextDigit(xs)
      case x :: xs if x == '/' => i / nextDigit(xs)
      case Nil => i
    }

  }

  def nextDigit(xs: List[Char]):Int = {
    xs match {
      case s::tail if s == '(' => calculate(xs.takeWhile(_ != ')'))
      case s::tail if s == ')' => calculate(tail)
      case _ => calculate(xs.dropWhile(_.isDigit), xs.takeWhile(_.isDigit).map(_.asDigit).foldLeft("")(_ + _).toInt)
    }
  }



}
