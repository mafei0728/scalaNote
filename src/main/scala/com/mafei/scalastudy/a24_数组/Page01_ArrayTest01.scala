package com.mafei.scalastudy.a24_数组

import org.testng.annotations.Test

/*
    @Classname Page01_ArrayTest01
    @Description
    @author mafei0728
    @Date 2020/7/15 21:49
    @version 1.0
*/
class Page01_ArrayTest01 {
  val arr01: Array[Int] = Array[Int](1, 2, 3, 4, 5, 6, 7)
  var arr02: Array[Int] = Array[Int](88, 88, 88)

  @Test
  def fun01: Unit = {
    for (i <- arr01) println(i)

  }

  def printArray(a: Array[Any]): Unit = {
    println(a.toList)
  }

  @Test
  def fun02: Unit = {
    // 合并两个Array 返回一个新的数组
    printArray(arr01 ++ arr02)
    printArray(arr01 ++: arr02)
    // 添加一个元素 ,前面
    printArray(arr01 :+ 12)
    // 后面添加一个元素
    printArray(12 +: arr01)
  }

  @Test
  def fun03: Unit = {
    // 前后字符串,中间分隔符
    implicit def s(a: String): StringBuilder = new StringBuilder(a)
    println(arr01.addString("a"))
    println(arr01.addString("a", "_"))
    println(arr01.addString("a", "b", "-", "c"))
  }
}
