package com.dama.scala.concepts.level1

object lists{
  def main(args: Array[String]): Unit = {
    var list:List[String] = List.empty[String]

    list :+="chennai"
    list :+="Bangalore"
    list :+="Amaravathi"

    println(list)
    list.foreach(println)
  }

}
