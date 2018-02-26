package hackerrank

import scala.annotation.tailrec
import scala.collection.mutable
import scala.collection.mutable.ListBuffer

// https://www.hackerrank.com/challenges/find-the-running-median/problem
object RunningMedian extends App {

  override def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val i = sc.nextInt()
    val a = new Array[Int](i)
    for (a_i <- 0 until i)
      a(a_i) = sc.nextInt()
    val ret = runningMedian(a)
    ret.foreach(println)
  }

  def rebalance(lowerHalf: mutable.PriorityQueue[Int], upperHalf: mutable.PriorityQueue[Int]): Unit = {
    if (Math.abs(lowerHalf.length - upperHalf.length) > 1) {
      val (greater, lesser) = if (lowerHalf.length > upperHalf.length)
        lowerHalf -> upperHalf
      else
        upperHalf -> lowerHalf
      while(greater.length - lesser.length > 1)
        lesser += greater.dequeue()
    }

  }

  def runningMedian(arr: Array[Int]): List[Double] = {
    val upperHalf = mutable.PriorityQueue.empty[Int](
      implicitly[Ordering[Int]].reverse
    )
    val lowerHalf = mutable.PriorityQueue.empty[Int]
    val ret = ListBuffer.empty[Double]
    var median: Double = 0
    arr.foreach(a => {
    //  if (lowerHalf.isEmpty)
      //  lowerHalf += a
     // else if (upperHalf.isEmpty)
    //    upperHalf += a
      if (a <= median)
        lowerHalf += a
      else
        upperHalf += a
      median = {
        val isEven = (upperHalf.length + lowerHalf.length) % 2 == 0
        if (upperHalf.length == lowerHalf.length)
          (upperHalf.head.doubleValue() + lowerHalf.head.doubleValue()) / 2
        else if (upperHalf.length > lowerHalf.length) {
          if (isEven)
            (upperHalf.head.doubleValue() + upperHalf.tail.head.doubleValue()) / 2
          else
            upperHalf.head
        }
        else {
          if (isEven)
            (lowerHalf.head.doubleValue() + lowerHalf.tail.head.doubleValue()) / 2
          else
            lowerHalf.head
        }
      }
      ret.append(median)
  //    rebalance(lowerHalf, upperHalf)
    })
    ret.toList
  }


}
