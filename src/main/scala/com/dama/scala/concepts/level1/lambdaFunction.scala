package com.dama.scala.concepts.level1
/*
An anonymous(lambda) function is a function that has no name but works as a function. It is good to create an anonymous function
when you don't want to reuse it later. You can create anonymous function either by using ⇒ (rocket) or _ (underscore) wildcard in Scala.
 */
object lambdaFunction {
  def main(args: Array[String]): Unit = {
    val sum = (a:Int,b:Int)=>a+b //// Anonymous function by using => (rocket)
    println(sum(10,20))

    val multiply = (_:Int)*(_:Int)
    println(multiply(5,10))
  }
}
