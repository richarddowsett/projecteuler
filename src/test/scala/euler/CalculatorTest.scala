package euler

import euler.Calculator.calculate
import org.scalatest.{Matchers, WordSpec}

class CalculatorTest extends WordSpec with Matchers{

  "Calculator" should {
    "calculate" in {
//      calculate("5+5") shouldEqual 10
//      calculate("10/2") shouldEqual 5
//      calculate("15*3") shouldEqual 45
//      calculate("15-9") shouldEqual 6
//      calculate("100*2") shouldEqual 200
      calculate("(100*2)+(5+5)") shouldEqual 210
      calculate("(100*2)/(10/2)") shouldEqual 40
//      calculate("(100*2)+5") shouldEqual 205
    }
  }

}
