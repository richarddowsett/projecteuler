import org.scalatest.{Matchers, WordSpec}
import BalancedString._
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
@RunWith(classOf[JUnitRunner])
class BalancedStringSpec extends WordSpec with Matchers{

  "String" should {
    "be balanced" in {
      "{one{two}}".isBalanced() shouldBe true
      "{[{[one]}]}".isBalanced() shouldBe true
    }

    "not be balanced" in {
      "{one{".isBalanced() shouldBe false
      "{]]{".isBalanced() shouldBe false
    }


  }

}
