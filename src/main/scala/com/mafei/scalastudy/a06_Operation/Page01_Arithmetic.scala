package com.mafei.scalastudy.a06_Operation

import org.testng.annotations.Test

/*
    @Classname Page01_Arithmetic
    @Description
    @author mafei0728
    @Date 2020/6/14 20:51
    @version 1.0
*/
class Page01_Arithmetic {

  @Test
  def fun01: Unit = {
    //
    val a: Double = 10 / 3
    println(a) // 3.0
    val b: Double = 10.0 / 3
    println(b.formatted("%.2f")) // 3.33

  }

    @Test
    def fun02: Unit = {
      val a: Double = 3.22
      val b: Float = 3.22F
      println(a == b)  // false

    }

}
