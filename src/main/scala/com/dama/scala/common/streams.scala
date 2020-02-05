package com.dama.scala.common

import scala.collection.immutable.Stream.cons

/*
The Stream is a lazy lists where elements are evaluated only when they are needed. This is a scala feature. Scala supports lazy computation.
It increases performance of our program. Streams have the same performance characteristics as lists.

Syntax :

val str = 1 #:: 2 #:: 3 #:: Stream.empty

In scala a List can be constructed with :: operator, whereas a Stream can be constructed with the #:: operator method, using Stream.
empty at the end of the expression. In above syntax the head of this stream is 1, and the tail of it has 2 and 3.
 */

object streams {

  def main(args:Array[String])
  {
    // Creating stream
    val stream = 1 #:: 2#:: 8 #:: Stream.empty
    println(stream)       //Stream(1, ?)

    val stream2: Stream[Int] = cons(1, cons(2, cons(3, Stream.empty) ) )
    println(s"Elements of stream2 = ${stream2}")  //Elements of stream2 = Stream(1, ?)


    val stream3 = 1 #:: 2#:: 8 #:: Stream.empty
    println(stream3) // Stream(1, ?)
    //Using take function on stream: take function is used to take elements from stream. Below is the example of using take function.

    print("Take first 2 numbers from stream = ")
    stream3.take(2).print   //Take first 2 numbers from stream = 1, 2, empty
    print("\nTake first 10 numbers from stream2 = ")
    println(stream3.take(10)) //Take first 10 numbers from stream2 = 1, 2, 8, empty
    //we wanted to take 10 numbers from a Stream, although it only contained 3 elements, it did not throw any IndexOutOfBoundsException.


    //Using map function on stream: map function is used to perform operation on stream.
    println("stream4 ")
    val stream4 = 1 #:: 2#:: 8 #:: Stream.empty
    println(stream4)

    // map elements from stream
    println(stream4.map{_+5})
    //In above example by using map function we are transforming the input collection to a new output collection.

    //Initialize an empty Stream: Below code shows how to initialize an empty Stream.

    val emptyStream: Stream[Int] = Stream.empty[Int]
    println(s"Empty Stream = $emptyStream")
  }

}
