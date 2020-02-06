package com.dama.scala.common
/*
A Higher-order function is a function that does at least one of the following: takes one or more Functions as Arguments,
returns a Function as its result.
 */
object higherOrderFunctions {

  def main(args: Array[String]) = {
    functionExample(25, multiplyBy2)                   // Passing a function as parameter
  }
  def functionExample(a:Int, f:Int=>AnyVal):Unit = {
    println(f(a))                                   // Calling that function
  }
  def multiplyBy2(a:Int):Int = {
    a*2
  }
}
