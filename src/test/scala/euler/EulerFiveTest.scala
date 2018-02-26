package euler

import euler.EulerFive.euler
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, WordSpec}

@RunWith(classOf[JUnitRunner])
class EulerFiveTest extends WordSpec with Matchers{

  "EulerFive" should {
    "be correct" in {

      euler(1 to 10) shouldEqual 2520
      euler(1 to 20) shouldEqual 232792560
    }
  }

}
