package com.dama.scala.common
/*
Runnable has a single method that returns no value.

trait Runnable {
  def run(): Unit
}

Callable is similar to run except that it returns a value

trait Callable[V] {
  def call(): V
}
 */
object concurrency extends App{

  /*
Threads
Scala concurrency is built on top of the Java concurrency model.
On Sun JVMs, with a IO-heavy workload, we can run tens of thousands of threads on a single machine.
A Thread takes a Runnable. You have to call start on a Thread in order for it to run the Runnable.
 */
  val hello = new Thread(new Runnable {
    def run() {
      println("hello world")
    }
  })

  hello.start()  //When you see a class implementing Runnable, you know it’s intended to run in a Thread somewhere by somebody.
}
