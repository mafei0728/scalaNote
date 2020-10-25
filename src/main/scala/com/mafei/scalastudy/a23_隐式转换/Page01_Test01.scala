package com.mafei.scalastudy.a23_隐式转换

/*
    @Classname Page01_Test01
    @Description
    @author mafei0728
    @Date 2020/7/13 21:37
    @version 1.0
*/
class Page01_Test01 {

}


object ObjectClass01 extends App{
  implicit val a:String = "m" // 隐式值
            // 隐式参数
  def fun01(implicit a:String): Unit ={
    println(a)
  }
  fun01
}