package com.mafei.scalastudy.a20_特质

/*
    @Classname Page06_自身类型
    @Description
    @author mafei0728
    @Date 2020/7/12 18:44
    @version 1.0
*/
class Page06_自身类型 {

}

class ClassTest06 {def fun01: Unit = println("c06")}

trait T6 {
  // 特质的自身类型
  this: ClassTest06 =>
  def fun02: Unit = fun01
}

class classTestF1 extends ClassTest06 {}
// 动态混入特质已经继承了一个类,该类如果在继承一个类,该类必须是混入特质超类的子类
class ClassTestF2 extends classTestF1 with T6 {}
object ObjectTest06 extends App {val c = new ClassTestF2;c.fun01}

