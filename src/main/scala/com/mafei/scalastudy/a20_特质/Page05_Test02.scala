package com.mafei.scalastudy.a20_特质

/*
    @Classname Page05_Test02
    @Description
    @author mafei0728
    @Date 2020/7/12 16:20
    @version 1.0
*/
class Page05_Test02 {
  val a = 13
  val b = 14
}

object ObjectTest05 extends App {
  val p = new Page05_Test02 with TraitTest05 {
    override val a: Int = 13232 // 冲突的属性必须重写
  }
  println(p.a)
  println(p.b)
}

trait TraitTest05 {
  val a = 12
  val b: Int
}