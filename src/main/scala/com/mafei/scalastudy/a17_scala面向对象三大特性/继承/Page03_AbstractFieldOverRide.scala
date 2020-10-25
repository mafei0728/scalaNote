package com.mafei.scalastudy.a17_scala面向对象三大特性.继承

/*
 * @Description
 * @Author  mafei0728
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/7/5
 */
object Page03_AbstractFieldOverRide {

}

abstract class AA{
  val a: String
  var b:Int
  def sayHi
}

class BB extends AA{
  val a: String = "12"
  var b: Int = 23

  def sayHi: Unit = {
    println("hello world!")
  }
}