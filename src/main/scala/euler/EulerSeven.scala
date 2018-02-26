package euler

import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer
import scala.math.BigInt


object EulerSeven extends App {

  def isPrime(input: BigInt): Boolean = {
    @tailrec
    def recurse(input: BigInt, list: List[BigInt]): Boolean = {
      list match {
        case Nil => true
        case x :: xs => if (input % x == 0) false
        else recurse(input, xs)
      }
    }

    recurse(input, (BigInt(2) until input).toList)
  }

  def nextPrime(input: BigInt): BigInt = {
    def recurse(i: BigInt): BigInt = {
      if (isPrime(i))
        i
      else
        recurse(i + 1)
    }

    recurse(input + 1)
  }

  lazy val primes: Stream[BigInt] = {
    def loop(v: BigInt): Stream[BigInt] = v #:: loop(nextPrime(v))

    loop(2)
  }

  def nthPrime(n: Int): BigInt = {
    @tailrec
    def primeRecursion(n: Int, current: BigInt): BigInt = {

      current match {
        case c if c == BigInt(0) => current
        case c if c % 2 == 0 | c % 3 == 0 => primeRecursion(n, current + 1)
        case c =>
          @tailrec
          def recurse(temp: Int, c: BigInt): (Int, Boolean) = {
            if (temp * temp >= c)
              temp -> false
            else if (c % temp == 0)
              temp -> true
            else
              recurse(temp + 1, c)
          }

          val temp = recurse(4, c)
          val (nextN, next) = if (!temp._2 && temp._1 * temp._1 > c)
            (n - 1, current + 1)
          else
            (n, current + 1)
          if (nextN == BigInt(0))
            current
          else {
            primeRecursion(nextN, next)
          }
      }
    }

    primeRecursion(n - 2, 4)
  }

  println(primes.take(15).max) // 43
  println(nthPrime(15))
  println(nthPrime(10001))
  println(primes.take(10001).max)
  //  println(primes.take(10001).max)
  //  println(isPrime(1999999))

}
