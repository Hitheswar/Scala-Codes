package com.dama.scala.common

object Tuples {
  def main(args: Array[String])
  {

    var name = (15, "chandan", true)

    //Access element from tuple
    println(name._1) // print 1st element
    println(name._2) // print 2st element
    println(name._3) // print 3st element

    //Pattern matching on tuples
    var (a, b, c) = (15, "chandan", true)
    println("a "+a)
    println("b "+b)
    println("c "+c)

    //iterating over tuple
    println("iterating")
    name.productIterator.foreach{i=>println(i)}

    println("Converting tuple to string:")
    println(name.toString())

    println("***Swap the elements of tuple***")
    val names = ("dama","aline")
    println(names.swap)

  }

}
