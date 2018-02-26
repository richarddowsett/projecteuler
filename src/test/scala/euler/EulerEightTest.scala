package euler

import euler.EulerEight.defaultInput
import org.scalatest.{Matchers, WordSpec}

class EulerEightTest extends WordSpec with Matchers{

  "EulerEight" should {
    "be correct" in {
      val result = EulerEight.createList("123456789".toList.map(_.toString), 4) equals List(List(1,2,3,4), List(2,3,4,5), List(3,4,5,6), List(4,5,6,7), List(5,6,7,8),
        List(6,7,8,9))
      println(result)
      println(EulerEight.createList("123456789".toList.map(_.toString), 4))
      EulerEight.runTest(4) shouldEqual 5832
      println(EulerEight.runTest(4))
      println(EulerEight.createList(defaultInput.toList.map(_.toString), 13).size)
      println(EulerEight.runTest(13))
    }
  }

}
