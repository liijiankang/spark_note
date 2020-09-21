package org.example

//object表示一个伴生对象，对应的类名是Test$
//是一个静态单例对象
object Test {
  def main(args: Array[String]): Unit = {
    printf("hello scala!")
  }
}
