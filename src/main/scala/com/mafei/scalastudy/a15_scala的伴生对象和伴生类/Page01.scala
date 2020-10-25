package com.mafei.scalastudy.a15_scala的伴生对象和伴生类

/*
    @Classname Page01
    @Description
    @author mafei0728
    @Date 2020/7/4 19:55
    @version 1.0
*/
class Page01 {
  val name = "mafei"
  def fun01: Unit ={
    println(name)
  }

}

object Page01{
  val address = "湖北仙桃"
  def fun: Unit ={
    println(address)
  }
}

object Test01 extends App{
  val p = new Page01
  p.name
  p.fun01
  Page01.address
  Page01.fun

}