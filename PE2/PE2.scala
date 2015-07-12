// Each new term in the Fibonacci sequence is generated by adding the previous 
// two terms. By starting with 1 and 2, the first 10 terms will be:

// 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

// By considering the terms in the Fibonacci sequence whose values do not 
// exceed four million, find the sum of the even-valued terms.

object PE2 {
  def fib(num: Int) : Int = {
    if (num == 0 || num == 1) {
      return num;
    }
    else {
      return fib(num-1) + fib(num-2);
    }
  }

  def main(args: Array[String]) : Unit = {
    var i = 0;
    var sum = 0;
    do {
      var n = fib(i);
      if (n%2==0) {
        sum += n;
      }
      i += 1;
    } while (fib(i) < 4000000)
    println(sum);
  }
}
