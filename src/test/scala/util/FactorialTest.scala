package util

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, WordSpec}

@RunWith(classOf[JUnitRunner])
class FactorialTest extends WordSpec with Matchers {

  "Factorial" should {
    "be correct" in {
      Factorial.factorial(5) shouldEqual 120
      Factorial.factorial(10) shouldEqual 3628800
      println(Factorial.factorial(1000000000000l))
    }
  }

}
