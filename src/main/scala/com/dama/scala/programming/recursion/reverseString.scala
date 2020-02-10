package com.dama.scala.programming.recursion

object reverseString {


  def main(args: Array[String]): Unit = {
    var str = "abcde"
    /*println(str,str.reverse)

    var buf_str = new StringBuilder
    for(i <- 0 until str.length)
      {
        buf_str.append(str.charAt(str.length-1-i))
      }
    println("buf_str "+buf_str.toString())*/

    var rev_str = recursive(str)
    println("rev_str "+rev_str)
  }
  def recursive(str: String): String = {
    val len = str.length
    println("str "+str,"str.length "+str.length)
    if(len == 1){
      str
    }
    else {
      println(str.substring(1,len))
      val result = recursive(str.substring(1,len))+ str.charAt(0)
      println("result "+result)
      println("hello")
      result
    }
  }
}