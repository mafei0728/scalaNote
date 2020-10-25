package com.mafei.scalastudy.a09_scala异常处理

import org.testng.annotations.Test

/*
    @Classname Page01_CatchTry
    @Description
    @author mafei0728
    @Date 2020/6/19 21:14
    @version 1.0
*/
class Page01_CatchTry {
  @Test
  def fun01(a: Int, b: Int): Unit = {
    try {
      val res = a / b
    } catch {
      case ex: ArithmeticException => println("除数不能为零")
      case ex: Exception => println("其他原因")
    }

  }

  @throws(classOf[ArrayIndexOutOfBoundsException])
  def fun2(a:Array[String]): Unit ={
    for(i<- a){
      println(i)
    }

  }
}
