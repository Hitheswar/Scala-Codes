package com.dama.scala.collections

/*
List is used to store ordered elements. It extends LinearSeq trait. It is a class for immutable linked lists.
This class is good for last-in-first-out (LIFO), stack-like access patterns.

It maintains order of elements and can contain duplicates elements also.

 */
object scalaList {
  def main(args: Array[String]): Unit = {
    var list = List(1,8,5,6,9,58,23,15,4)
    var list2:List[Int] = List(1,8,5,6,9,58,23,15,4)
    println(list)
    println(list2)


  }
}
