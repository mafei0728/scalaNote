package com.mafei.scalastudy.a19_伴生对象

/*
    @Classname ScalaClass01
    @Description
    @author mafei0728
    @Date 2020/7/11 22:40
    @version 1.0
*/
class ScalaClass01 {
  var name: String = _
  var age: Int = _

  def this(name: String, age: Int) {
    this
    this.name = name
    this.age = age
  }
}


object ScalaClass01 {
  val count = 12

  def sFun01: Unit = {
    println("静态的方法")
  }

  def apply: ScalaClass01 = {
    new ScalaClass01
  }

  def apply(name: String, age: Int): ScalaClass01 = {
    new ScalaClass01(name, age)
  }
}

object Test01 {
  def main(args: Array[String]): Unit = {
    val s1 = ScalaClass01
    val s2 = ScalaClass01("v", 999999999)
  }
}
