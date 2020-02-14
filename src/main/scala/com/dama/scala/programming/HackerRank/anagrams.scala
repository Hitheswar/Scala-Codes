package com.dama.scala.programming.HackerRank

object anagrams {
  def main(args: Array[String]): Unit = {
    var arr = Array("code","deco","name","abc","bac","sdfghjkjhgfdfghjkhgf")
    var list = arr.map(x =>x.toCharArray.sorted.mkString(""))

    list.distinct.foreach(println)
  }

}
