package com.dama.scala.programming.recursion
//to find nth fibonacciNumber
object fibonacciNumber {

  //1 1 2 3 5 8
  def main(args: Array[String]): Unit = {
    println(fib(6))
  }
  def fib(n: Int): Int = {
    if(n == 0) 0
    else if(n == 1) 1
    else {
      fib(n-1)+fib(n-2)
    }
  }
}
/*
fib(6)
fib(5)                                            +           fib(4)
fib(4)+fib(3)                                     +           fib(3)+fib(2)
fib(3)+fib(2)+fib(2)+fib(1)                       +           fib(2)+fib(1)+fib(1)+fib(0)
fib(2)+fib(1)+fib(1)+fib(0)+fib(1)+fib(0)+1       +           fib(1)+fib(0)+1+1+0
fib(1)+fib(0)+fib(1)+fib(1)+fib(0)+fib(1)+fib(0)+1+

1+0+1+1+0+1+0+1                                   +           1+0+1+1+0
 */