package com.dama.scala.concepts.level1
/*
 Yield is used with a loop, Yield produces a value for each iteration. Another way to do is to use map/flatMap and filter with nomads.
 */
object scalaYield {
  def main(args: Array[String]): Unit = {
   var array =for(i <- 1 to 5) yield  i
    println(array)
  }

}
