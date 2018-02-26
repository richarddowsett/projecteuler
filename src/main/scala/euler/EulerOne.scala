package euler

object EulerOne extends App {


  def euler(i: Int) = (1 until i).filter(j => j % 5 == 0 || j % 3 == 0).sum


  println(euler(10)) // 23
  println(euler(1000)) // ?

}
