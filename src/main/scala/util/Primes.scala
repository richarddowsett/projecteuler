package util

import scala.collection.mutable.ListBuffer

object Primes {

  def primesToN(n:Int):List[Int] = {
    val arr = List.fill(n + 1)(true).toArray
    arr(0) = false
    arr(1) = false
    (2 to Math.sqrt(n).toInt).foreach(i => {
      if(arr(i)){
        Range(i * i, n, i).foreach(j => {
          arr(j) = false
        })
      }
    })
    var count = 0
    val ret = ListBuffer.empty[Int]
    arr.foreach(b => {
      if(b)
        ret.append(count)
      count = count + 1
    })
    ret.toList
  }

}
