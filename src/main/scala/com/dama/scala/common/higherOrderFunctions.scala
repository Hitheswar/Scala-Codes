package com.dama.scala.common
/*
A Higher-order function is a function that does at least one of the following: takes one or more Functions as Arguments,
returns a Function as its result.
 */
object higherOrderFunctions {

  def main(args: Array[String]): Unit = {
    println(apply(format, 32))
    def apply(x: Double => String, y: Double) = x(y)
    def format[R](z: R) = "{" + z.toString() + "}"

    //Ex - 2
    val num = List(7, 8, 9)
    def multiplyValue = (y: Int) => y * 3
    val result = num.map(y => multiplyValue(y))

    println("Multiplied List is: " + result)
  }
}
