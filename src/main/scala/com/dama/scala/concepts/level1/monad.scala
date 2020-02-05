package com.dama.scala.concepts.level1
/*
In Scala, Monads is a construction which performs successive calculations. It is an object which covers the other object.
It is worth noting that here, the output of an operation at some step is an input to another computations,
which is a parent to the recent step of the program stated. Monad is neither a class nor a trait, it is a concept.
The maximum collections of the Scala are Monads but not all the Monads are collections, there are several Monads which are containers
like Options in Scala. In short, we can say that in Scala the data types that implements map as well as flatMap() like Options, Lists, etc.
are called as Monads.

The objects are enclosed with Monads as it yields the following two functions:

unit() : It is like void in Java, it does not returns any data types.
flatMap() : It is similar to the map() in Scala but it returns a series in place of returning a single component.

 */
object monad extends App {

  var x = Seq("scala","java","python")
  var y = x.map(_.toUpperCase())
  y.foreach(println)
  println(y)

  println(y.flatMap(_.toUpperCase()))
/*
So, when a flatMap is applied on the Sequence stated above then a List is returned where the inner grouping is removed and a sequence is generated.
Note: Collections that support map as well as flatMap are called as monadic. Now, let’s see some examples of Monads in Scala.
 */

  val list1 = List(1, 2, 3, 4)
  val list2 = List(5, 6, 7, 8)

  val z1 = list1.flatMap(x1 => list2.map(y1 =>x1+y1))
  println("Z1   "+z1)
  val z2 = list1.map(x1 => list2.map(y1 =>x1+y1))
  println("Z2   "+z2)



}
