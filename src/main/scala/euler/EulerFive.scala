package euler

object EulerFive extends App{

  def euler(list: Iterable[Int]) = {
    def recurse(count: Int, list:Iterable[Int], increment: Int): Int = {
      list.forall(i => count % i == 0) match {
        case true => count
        case false => recurse(count + increment, list, increment)
      }
    }

    val increment = list.max
    recurse(increment, list, increment)
  }



}
