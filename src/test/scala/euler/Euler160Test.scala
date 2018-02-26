package euler

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, WordSpec}

@RunWith(classOf[JUnitRunner])
class Euler160Test extends WordSpec with Matchers {

  "Euler160" should {
    "be correct" in {
      Euler160.solve(9) shouldEqual 36288
      Euler160.solve(10) shouldEqual 36288
      Euler160.solve(20) shouldEqual 17664
      Euler160.solve(BigInt(1000000000000l)) shouldEqual 12345
    }
  }

}
