package com.dama.scala.common
/*
A Trait can be defined as a unit which Encapsulates the method and its variables or fields.
 */
trait scalaTrait {
  def print()
}
class A4 extends scalaTrait{
  def print(){
    println("Hello")
  }
}
object MainObject{
  def main(args:Array[String]){
    var a = new A4()
    a.print()
  }
}