// A palindromic number reads the same both ways. The largest palindrome made 
// from the product of two 2-digit numbers is 9009 = 91 × 99.

// Find the largest palindrome made from the product of two 3-digit numbers.

object PE4 {
  def isPalindrome( number:Int ) : Boolean = {
    return number.toString.reverse == number.toString;
  }

  def palindromeProduct( start:Int, end:Int ) : Int = {
    var num = 0;
    var i = 99;
    for (i <- end to start by -1) {
      var j = 99;
      for (j <- end to start by -1) {
        if (isPalindrome((j*i))) {
          if (num < (j*i)) {
            num = (j*i);
          }
        }
      }
    }
    return num;
  }

  def main(args: Array[String]) : Unit = {
    println( palindromeProduct(100, 999) );
  }
}
