package com.mafei.scalastudy.a20_特质

/*
    @Classname Page01_ClassTest01
    @Description
    @author mafei0728
    @Date 2020/7/12 14:01
    @version 1.0
*/
class Page01_ClassTest01 extends TraitTest01 {
  override def fun01: Unit = {
    println("抽象方法的实现")
  }

}

trait TraitTest01{
  def fun01
  def fun02: Unit ={
    println("普通方法")
  }
}

object ObjectTest01{
  def main(args: Array[String]): Unit = {

  }
}