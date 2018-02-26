package euler

import scala.collection.mutable


object EulerTenAttempt2 extends App{

  def primes(limit: BigInt): List[BigInt] = {
    val A = mutable.Map.empty ++ (BigInt(2) to limit).map(_ -> true).toMap
    val inclusive = BigInt(2) to BigInt(1414)
    inclusive.foreach(i => {
      if(A(i)){
        val range = List.range(i * i, limit + i, i)
        range.filter(i => A.contains(i)).foreach(r => A += r -> false)
      }
    })
    A.filter(tuple => tuple._2).toList.map(_._1)
  }



//  println(primes(10).sorted)
//  println(primes(10).sum)
//  println(primes(20).sorted)
//  println(primes(2000000).par.filterNot(i => EulerSeven.isPrime(i)))
  println(primes(2000000).sum)
}
