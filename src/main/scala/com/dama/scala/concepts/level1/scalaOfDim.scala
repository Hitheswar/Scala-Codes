package com.dama.scala.concepts.level1
import Array.ofDim
/*
ofDim() is a method in Scala that lets us create multidimensional arrays. Since these let us store data in more than one dimension,
we can store data like in a matrix. Let’s take an example.
 */
object scalaOfDim {
  def main(args: Array[String]): Unit = {
    var multi_arr = Array.ofDim[Int](3, 3)
    var k = 1
    for(i <- 0 to 2;j <- 0 to 2) {
        multi_arr(i)(j) = {i+k}
        k = k+1
      }
    for(i <- 0 to 2;j <- 0 to 2){
      println(multi_arr(i)(j))
    }
  }
}
