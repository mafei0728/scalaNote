package com.mafei.scalastudy.a08_函数式编程基础

/*
    @Classname Page01_函数的定义
    @Description
    @author mafei0728
    @Date 2020/6/18 21:14
    @version 1.0
*/
object Page01_函数的定义 {
  def main(args: Array[String]): Unit = {
    println(fun05(12))
  }

  def fun01(a: Int): Int = {
    1
  }

  def fun02: Int = {
    4
  }

  def fun03: Unit = {
    return 12
  }

  def fun05(n: Int): Int = {
    if (n <= 1) {
      12
    } else {
      fun05(n-1) + fun05(n-2)
    }
  }
}
