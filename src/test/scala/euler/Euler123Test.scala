package euler

import euler.Euler123.hitTarget
import org.scalatest.WordSpec
import euler.EulerFive.euler
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, WordSpec}

@RunWith(classOf[JUnitRunner])
class Euler123Test extends WordSpec {

  "Euler123" should {
    "be correct" in {
      println(hitTarget(BigInt(10).pow(9)))
      println(hitTarget(BigInt(10).pow(10)))
    }
  }

}
