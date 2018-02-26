package euler

import scala.annotation.tailrec
import scala.util.control.TailCalls.TailRec

object EulerTen extends App {

  def primes(limit: Int): List[Int] = {
    val fullList = (2 to limit).toList
    primeList(fullList, 2)

  }

  @tailrec
  private final def primeList(fullList: List[Int], p: Int): List[Int] = {
    println(p)
    fullList.max match {
      case i if i == p => fullList
      case _ => val pList = range(p * p, fullList.max, p)
        val nextList = fullList.diff(pList)
        val nextP = nextList.dropWhile(_ <= p).head
        primeList(nextList, nextP)
    }
  }

  def range(start: Int, stop: Int, step: Int) = {
    List.range(start, stop + step, step)
    //    @tailrec
//    def recursive(l: List[Int], next: Int, stop: Int, step: Int): List[Int] = {
//      if (l.nonEmpty && l.max > stop)
//        l
//      else
//        recursive(l :+ next, next + step, stop, step)
//    }
//
//    recursive(List.empty[Int], start, stop, step)
  }

  println(range(4, 10, 2))
  println(List(2, 3, 4, 5, 6, 7, 8, 9, 10).diff(range(4, 10, 2)))
  println(primes(10))
  println(primes(10).sum)
  println(primes(2000000).sum)
}
