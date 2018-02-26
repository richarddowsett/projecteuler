package util

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, WordSpec}

@RunWith(classOf[JUnitRunner])
class StackTest extends WordSpec with Matchers {

  "Stack" should {
    "push and pop" in {
      val s = Stack("1").push("2").push("3")
      val result1 = s.pop()
      result1._1 shouldEqual "3"
      val result2 = result1._2.pop()
      result2._1 shouldEqual "2"
      val result3 = result2._2.pop()
      result3._1 shouldEqual "1"
      result3._2.isEmpty shouldBe true
      s.isEmpty shouldBe false
    }
  }

}
