package com.dama.scala.concepts.level1
/*
The Option in Scala is referred to a carrier of single or no element for a stated type. When a method returns a value which can even be null
then Option is utilized i.e, the method defined returns an instance of an Option, in place of returning a single object or a null.

Important points :

The instance of an Option that is returned here can be an instance of Some class or None class in Scala, where Some and None are the children of
 Option class.
When the value of a given key is obtained then Some class is generated.
When the value of a given key is not obtained then None class is generated.
 */
object scalaOption {

  def main(args: Array[String]): Unit = {
    val name = Map("Nidhi" -> "author","Geeta" -> "coder")
    println(name.get("Nidhi"))
    println(name.get("neela"))
    /*
    Here, key of the value Nidhi is found so, Some is returned for it but key of the value neela is not found so, None is returned for it.
     */
  }


}
