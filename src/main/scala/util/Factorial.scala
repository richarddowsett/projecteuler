package util

import scala.annotation.tailrec

object Factorial {

  @tailrec
  def factorial2(n: BigInt, product: BigInt = 1): BigInt = {
    if (n == 1)
      product
    else
      factorial2(n - 1, n * product)
  }

  def factorial(n: BigInt): BigInt = {
    Stream.range(BigInt(1),n+1).product
  }

}
