package com.dama.scala.collections
/*
Map is used to store elements. It stores elements in pairs of key and values.
In scala, you can create map by using two ways either by using comma separated pairs or by using rocket operator.
 */
object scalaMap {
  def main(args: Array[String]): Unit = {
    var map = Map(("A","Apple"),("B","Ball"))
    var map2 = Map("A"->"Aple","B"->"Ball")
    var emptyMap:Map[String,String] = Map.empty[String,String]
    println(map)
    println(map2)
    println("Empty Map: "+emptyMap

  }

}
