package com.dama.scala.concepts.level1
/*
 Map is a collection of key/value pairs. Scala retrieves a Value based on its Key.

 A Map in Scala is a collection of key-value pairs, and is also called a hash table. We can use a key to access a value.
 These keys are unique; however, the values may be common. The default Scala Map is immutable. To use a mutable Map,
 we use the scala.collection.mutable.Map class.
 To use both in the same place, refer to the immutable Map as Map, and to the mutable Map as mutable.Map.
 */
object scalaMap {
  def main(args: Array[String]): Unit = {

    val emptyMap:Map[String,Int] = Map()        //declaring empty map
    println(emptyMap.isEmpty)       //true


    var colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF")
    colors +=("blue"->"#hjil")

    println("keys "+colors.keys)      //Set(red, azure, blue)

    println("colors(\"azure\") "+colors("azure"))   //#F0FFFF

    println("values "+colors.values)    //MapLike.DefaultValuesIterable(#FF0000, #F0FFFF, #hjil)

    var colors2 = Map("yellow"->"#jklo","black"->9)

    var concat = colors++colors2      //concatination
    //concat.foreach(println)

    concat.foreach(x=>
    println(x._1,x._2)
    )
  }
}
