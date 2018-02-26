package hackerrank

import org.apache.commons.io.IOUtils
import org.scalatest.{Matchers, WordSpec}

import scala.collection.mutable

class RunningMedianTest extends WordSpec with Matchers {

  "Running Median" should {
    "return running median" in {
      val ret = RunningMedian.runningMedian(Array(12, 4, 5, 3, 8, 7))
      ret shouldEqual List(12, 8, 5, 4.5, 5, 6)
    }

    "return running median from file" in {
      val input = IOUtils.toString(getClass.getClassLoader.getResourceAsStream("RunningMedianInput.txt")).split("\r\n").map(_.toInt)
      val expected = IOUtils.toString(getClass.getClassLoader.getResourceAsStream("RunningMedianOutput.txt")).split("\r\n").map(_.toDouble)
      val ret = RunningMedian.runningMedian(input)
      ret shouldEqual expected
    }

    "return running median from file 2" in {
      val input = IOUtils.toString(getClass.getClassLoader.getResourceAsStream("RunningMedian2.txt")).split("\r\n").map(_.toInt)
      val expected = IOUtils.toString(getClass.getClassLoader.getResourceAsStream("RunningMedianOutput2.txt")).split("\r\n").map(_.toDouble)
      val ret = RunningMedian.runningMedian(input)
      ret shouldEqual expected
    }

    "return running median from file 3" in {
      val input = IOUtils.toString(getClass.getClassLoader.getResourceAsStream("RunningMedian3.txt")).split("\r\n").map(_.toInt)
      val expected = IOUtils.toString(getClass.getClassLoader.getResourceAsStream("RunningMedianOutput3.txt")).split("\r\n").map(_.toDouble)
      val ret = RunningMedian.runningMedian(input)
      ret shouldEqual expected
    }
  }

}
