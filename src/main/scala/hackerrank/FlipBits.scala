package hackerrank

// https://www.hackerrank.com/challenges/flipping-bits/problem
object FlipBits {

  def run(input:String) = {

  }

  def flip(i:Long):Long = {
  val tempList = i.toBinaryString.toList.map(c => c.asDigit)
    def recurse(l:List[Int]):List[Int] = {
      if(l.lengthCompare(32) == 0)
        l
      else
        recurse(0 :: l)
    }
    val paddedList = recurse(tempList)
    var l = 0l

    paddedList.foreach({
      case 0 => l = (l << 1) ^ 1
      case 1 => l = l << 1
    })
    l
  }

}
