// 2520 is the smallest number that can be divided by each of the numbers from 
// 1 to 10 without any remainder.

// What is the smallest positive number that is evenly divisible by all of the 
// numbers from 1 to 20?

object PE5 {
  def gcd(a: Int, b: Int):Int=if (b==0) a.abs else gcd(b, a%b)

  def lcm(a: Int, b: Int):Int=(a*b).abs/gcd(a,b)

  def lcm_list(numbers: Array[Int]) : Int = {
    return numbers.foldLeft(1) { (acc, n) => 
      lcm(acc, n);
    }
  }

  def findSmallestLcm : Int = {
    return lcm_list((1 to 19).toArray)
  }
  
  def main(args: Array[String]) : Unit = {
    println(findSmallestLcm);
  }
}
