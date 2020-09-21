package org.example

object PrintDemon {

  /**
   * 字符串通过+拼接
   * 通过printf，通过%传值
   * 通过$引用
   *
   * @param args
   */
  def main(args: Array[String]): Unit = {
    var str1 = "hello"
    var str2 = "scala"
    println(str1 + str2)
    var age = 10
    var sal:Float = 10.8f
    var weight:Double = 10.09d
    printf("年龄：%s 薪资：%s 体重：%s",age,sal,weight)
    println(s"信息:\n 年龄：$age 薪资：$sal 体重：$weight")
  }

}
