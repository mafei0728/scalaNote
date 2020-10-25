package com.mafei.scalastudy.a20_特质

/*
    @Classname Page04_Test01
    @Description
    @author mafei0728
    @Date 2020/7/12 16:09
    @version 1.0
*/
class Page04_Test01{

}


object ObjectTest04{
  def main(args: Array[String]): Unit = {
    val p = new Page04_Test01 with TraitTest04F1 with TraitTestF2{
      override def fun01: Unit = println()
      override def fun02: Unit = println()
      override def f: Unit = super[TraitTest04F1].f
    }

    p.f
  }
}

trait TraitTest04F1{
  def f: Unit ={
    println("1")
  }
  def fun01
}

trait TraitTestF2{
  def f: Unit ={
    println("2")
  }
  def fun01
  def fun02
}