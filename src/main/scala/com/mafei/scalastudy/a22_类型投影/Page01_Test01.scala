package com.mafei.scalastudy.a22_类型投影

/*
    @Classname Page01_Test01
    @Description
    @author mafei0728
    @Date 2020/7/12 19:46
    @version 1.0
*/
class Page01_Test01 {

}

class OutClass{
  val table_name = "te_ft_result01"
  val s = s"select * from ${table_name}"
  class InnerClass{
    def fun01(c:OutClass#InnerClass): Unit ={
      println(c)
    }
  }
}


object ObjectTest01 extends App {
  val s1 = new OutClass
  println(s1.s)
  val s2 = new OutClass
  val c1 = new s1.InnerClass
  val c2 = new s2.InnerClass
  // 这里我们调用方法,传入本身没有问题
  c1.fun01(c1)
  // 单刷传入c2就有问题,因为c1是和s1绑定的. c2是s2的对象的内部类对象
  c1.fun01(c2)
}