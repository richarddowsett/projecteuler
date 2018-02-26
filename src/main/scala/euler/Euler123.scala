package euler

import scala.annotation.tailrec

object Euler123 extends App {


  @tailrec
  def hitTarget(target: BigInt, n: Int = 1, primes: Stream[BigInt] = EulerSeven.primes.take(100000)): Int = {
    val p = primes.head
    def t(i:Int) = ((p - 1).pow(i)) + ((p + 1).pow(i))
    lazy val r = t(n) mod p.pow(2)
    if (n % 2 != 0 && r > target)
      n
    else
      hitTarget(target, n + 1, primes.tail)
  }




}
