package com.dama.scala.collections

import scala.collection.SortedSet

/*
It is used to store unique elements in the set. It does not maintain any order for storing elements. You can apply various operations on them.
It is defined in the Scala.collection.immutable package
 */
object scalaSet {
  def main(args: Array[String]): Unit = {
    val set1 = Set()                            // An empty set
    val games = Set("Cricket","Football","Hocky","Golf")    // Creating a set with elements
    println(set1)
    println(games)

    println(games.head, games.tail,games.isEmpty)

    for(game <- games){
      println("game "+game)
    }

    games.foreach((game:String)=>println("game "+game))  //using foreach loop

    var numbers: SortedSet[Int] = SortedSet(5,8,1,2,9,6,4,7,2,2)
    numbers.foreach((element:Int)=> print(element+", ")) //returns a Set after sorting elements


  }
}
