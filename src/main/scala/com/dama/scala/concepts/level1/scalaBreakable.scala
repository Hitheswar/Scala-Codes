package com.dama.scala.concepts.level1
import scala.util.control.Breaks._                  // Importing  package

object scalaBreakable {
  def main(args: Array[String]): Unit = {
    breakable(
      for (i <- 0 to 10){
        if(i == 5){
          break()
        }
        else println(i)
      }
    )
  }
}
