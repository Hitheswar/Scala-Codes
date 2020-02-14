package com.dama.scala.programming.HackerRank

object mysteryAlgorithm {
  def main(args: Array[String]): Unit = {
    var x = 2437
    var y = 875

    for(i <- 1 to 20){
      if(x>y){
        x = x-y
      }
      if(x<y){
        y = y-x
      }
      println(x,y)
    }
  }
}

