package com.mafei.scalastudy.a07_循环控制

import org.testng.annotations.Test

/*
    @Classname Page2_for
    @Description
    @author mafei0728
    @Date 2020/6/17 21:42
    @version 1.0
*/
class Page02_for {

  @Test
  def fun01: Unit = {
    // 闭合
    for (i <- 1 to 3) {
      println(i)
    }
  }

  def fun02: Unit = {
    // 左闭右开
    for (i <- 1 until 3) {
      println(i)
    }
  }

  @Test
  def fun03: Unit = {
    for {i <- 1 to 10
         if i % 2 == 0
         j= 1+2
         } {
      println(i)
      println(j)

    }
  }

  def fun04: Unit ={
    for(i<- 1 to 10; j=i+2){
      println(j)
    }
  }

  @Test
  def fun05: Unit ={
    val a = for(i<- 1 to 10) yield i
    println(a)
  }
}
