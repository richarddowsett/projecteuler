package euler

import org.scalatest.WordSpec
import euler.EulerFive.euler
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, WordSpec}

@RunWith(classOf[JUnitRunner])
class TreeTest extends WordSpec {

  "Tree" should {
    "be created" in {
      println(Tree(List(4,2,5,1)))
    }
  }

}
