package hackerrank

import org.scalatest.{Matchers, WordSpec}

class FlipBitsTest extends WordSpec with Matchers {

  "FlipBits" should {
    "flip bits" in {
      FlipBits.flip(2147483647l) shouldEqual 2147483648l
      FlipBits.flip(1) shouldEqual 4294967294l
    }
  }

}
