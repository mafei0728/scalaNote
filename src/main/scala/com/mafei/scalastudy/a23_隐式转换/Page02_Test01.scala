package com.mafei.scalastudy.a23_隐式转换

/*
    @Classname Page02_Test01
    @Description
    @author mafei0728
    @Date 2020/7/13 21:46
    @version 1.0
*/
class Page02_Test01 {

}

object ObjectTest02 extends App {

  implicit class ClassAA(val a: ClassBB) {
    def fun01: Unit = {
      println("AAA")
    }
  }

  val b = new ClassBB
  b.fun02
  b.fun01
}

class ClassBB {
  def fun02: Unit = {
    println("BBB")
  }
}
