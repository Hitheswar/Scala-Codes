package com.dama.scala.common
//‘Recursion’ is a function that calls itself
/*
Recursion is a method which breaks the problem into smaller sub problems and calls itself for each of the problems.
That is, it simply means function calling itself. We can use recursion instead of loops. Recursion avoids mutable state associated with loops.
Recursion is quite common in functional programming and provides a natural way to describe many Algorithms. Recursion is considered as to be
important in functional programming. Scala supports Recursion very well.
 */
object Recursion {

  def fact(n: Int): Int ={
    if(n == 1) 1
    else n * fact(n - 1)
  }
  // Main method
  def main(args:Array[String])
  {
    println(fact(4))
  }
}
