package com.mafei.scalastudy.a21_嵌套类

import com.mafei.scalastudy.a21_嵌套类

/*
    @Classname Page01_Test01
    @Description
    @author mafei0728
    @Date 2020/7/12 18:59
    @version 1.0
*/
class Page01_Test01 {

}


class OutClass {
  outer =>

  class InnerClass01 {
    def fun01: Unit = {
      // 普通方式
      println(OutClass.this.a)
      OutClass.this.fun01
      // 别名方式
      outer.fun01
      println(outer.a)
    }
  }

  val a = 12

  def fun01 {
    println("a")
  }
}

object OutClass {
  val a = 12
  def fun02: Unit ={
    println(12)
  }
  class InnerClass02 {
    println(a)
    println(fun02)
  }

}

object ObjectTest extends App {
  val o1 = new OutClass
  // 对象类部类创建
  val innerClass01 = new o1.InnerClass01
  // 静态内部类的创建
  val innerClass02 = new OutClass.InnerClass02

}
