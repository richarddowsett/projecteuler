package euler

import util.Factorial

import scala.collection.mutable.ListBuffer

object Euler160 {

  def solve(n: BigInt): BigInt = {
    val factorial = Factorial.factorial(n)
    val arr = factorial.toString().toCharArray
    var i = arr.length - 1
    while (arr(i) == '0')
      i = i - 1
    val returnArr = new Array[Char](5)
    var j = 5
    while (j != 0) {
      val temp = arr(i)
      returnArr(j - 1) = temp
      j = j - 1
      i = i - 1
    }
    val ret = new String(returnArr)
    ret.toInt
  }

}
