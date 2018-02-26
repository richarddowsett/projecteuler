package util

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, WordSpec}


@RunWith(classOf[JUnitRunner])
class PrimesTest extends WordSpec with Matchers{

  "Primes" should {
    "be correct" in {
      Primes.primesToN(13) shouldEqual List(2,3,5,7,11,13)
    }
  }

}
