package hackerrank

import org.scalatest.{Matchers, WordSpec}

class MinimaxTest extends WordSpec with Matchers {

  "Minimax" should {
    "solve permutation" in {
      Minimax.solvePermutation(List(3, 2, 1, 4).toArray) shouldEqual 5
      Minimax.solvePermutation(List(1, 3, 2).toArray) shouldEqual 2
    }

    "solve prolem" in {
      Minimax.anotherMinimaxProblem(List(1, 2, 3, 4).toArray) shouldEqual 5
      Minimax.anotherMinimaxProblem(List(1, 2, 3).toArray) shouldEqual 2
    }
  }

}
