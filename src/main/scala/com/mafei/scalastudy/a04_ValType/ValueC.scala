package com.mafei.scalastudy.a04_ValType

import org.testng.annotations.Test

/*
    @Classname ValueC
    @Description
    @author mafei0728
    @Date 2020/6/13 20:40
    @version 1.0
*/
class ValueC {

  @Test
  def fun01: Unit ={
    // 转成整数
    var b:Byte = 15
    println(b.toInt)
  }

  @Test
  def fun02: Unit ={
    var a: Float = 1.2345f
    val b = 1.23455
    println(b.toFloat)
  }

  @Test
  def fun03: Unit ={
    val a:Int = 12
    val b:Char = 13
    // 不能把变量赋给
    // val c:Char = a
    // 由于计算后,类型转换为整数,也不能赋给
    // val d:Char = 12+1
  }

  @Test
  def fun04: Unit ={
    val a = "2.34"
    // println(a.toInt)
    println("2".toFloat)

  }

  @Test
  def fun05: Unit ={
    val ++ = 12
    println(++)
    val -- = 12
    val --++ = 12
    val ------ =12
    println(--)
    println(--++)
  }

}
