package com.dama.scala.collections

/*
Seq is a trait which represents indexed sequences that are guaranteed immutable. You can access elements by using their indexes.
It maintains insertion order of elements.

Sequences support a number of methods to find occurrences of elements or subsequences. It returns a list.


 */
object scalaSeq {
  def main(args: Array[String]): Unit = {

    var seq:Seq[Int] = Seq(52,85,1,8,3,2,7,7)
    seq.foreach((element:Int) => print(element+" "))
    println(seq(2))       //Accessing element by using index

    println("\nis Empty: "+seq.isEmpty)
    println("Ends with (2,7): "+ seq.endsWith(Seq(2,7)))
    println("start with : "+seq.startsWith(Seq(1,4)))



  }

}
