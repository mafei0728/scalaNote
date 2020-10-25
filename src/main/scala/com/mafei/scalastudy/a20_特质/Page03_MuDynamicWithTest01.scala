package com.mafei.scalastudy.a20_特质

/*
    @Classname Page02_动态混入
    @Description
    @author mafei0728
    @Date 2020/7/12 14:38
    @version 1.0
*/
class Page03_DynamicWithTest01 {

}

trait Base {
  println("base")

  def fun01
}

trait AA extends Base {
  println("AA")

  override def fun01: Unit = {
    println("AA重写")
  }
}

trait T1 extends AA {
  println("t1")

  override def fun01: Unit = {
    println("T1重写")
    super.fun01
  }

  super.fun01
}

trait T2 extends AA {
  println("t2")

  override def fun01: Unit = {
    println("T2重写")
    super.fun01
  }

  super.fun01
}

object ObjectTest03 extends App {
  val t = new Page03_DynamicWithTest01 with T1 with T2
  t.fun01

}
