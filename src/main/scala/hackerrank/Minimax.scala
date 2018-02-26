package hackerrank


// https://www.hackerrank.com/challenges/yet-another-minimax-problem/problem
object Minimax {


  def anotherMinimaxProblem(a: Array[Int]): Int = {
    a.toList.permutations.map(l => solvePermutation(l.toArray)).min
  }

  def solvePermutation(a: Array[Int]): Int = {
    var counterA = 0
    var counterB = 1
    var max = 0
    while (counterB <= a.length - 1) {
      val intA = a(counterA)
      val intB = a(counterB)
      val temp = intA ^ intB
      if (temp > max) max = temp
      counterA = counterA + 1
      counterB = counterB + 1
    }
    max
  }

}
