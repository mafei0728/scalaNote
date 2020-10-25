package com.mafei.scalastudy.a20_特质

/*
    @Classname Page02_动态混入
    @Description
    @author mafei0728
    @Date 2020/7/12 14:38
    @version 1.0
*/
class Page02_DynamicWithTest01 {

}


trait TraitTest02 {
  def fun01

  def fun02: Unit = {
    println("....")
  }
}

object ObjectTest02 {
  // 动态混入
  def main(args: Array[String]): Unit = {
    val s = new Page02_DynamicWithTest01 with TraitTest02 {
      override def fun01: Unit = println("....")
    }
    s.fun01
    s.fun02
  }

}
