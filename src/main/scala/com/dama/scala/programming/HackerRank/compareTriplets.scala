package com.dama.scala.programming.HackerRank

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.IntType

import scala.collection.mutable.ListBuffer


object compareTriplets {
  def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {

    var result = new ListBuffer[Int]()
    for (i <- 0 until a.size) {
        if(a(i) == b(i)) " "
        else if (a(i) >b(i) || a(i)<b(i)){
          result += 1
      }
    }
    result.toArray
  }

  def main(args: Array[String]): Unit = {
    var a = Array(5,6,7)
    var b = Array(3,6,10)
    val result = compareTriplets(a, b)
    result.foreach(println)
  }
}
