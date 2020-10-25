package com.mafei.scalastudy.a17_scala面向对象三大特性.继承

/*
    @Classname Page01
    @Description
    @author mafei0728
    @Date 2020/7/5 19:17
    @version 1.0
*/

object Page01_overView extends App{
  val p01:Person = new Person
  val p02:Men = new Men
  println(p02.isInstanceOf[Person])
  println(p02.isInstanceOf[Men])
  println(p01.isInstanceOf[Men])
  val p03 = p02.asInstanceOf[Person]

}


class Person {
  var name: String = _
  protected var age: Int = _
  private var hobby:String = _

  def fun01: Unit ={
    println("父类")
  }

  def setHobby(hobby:String): Unit ={
    this.hobby = hobby
  }
}

class Men extends Person{
  // 可以访问的属性
  name = "mafei"
  // 调用父类的属性
  age = 12
  // 私有的只能通过公共方法来访问
  setHobby("看书")

  def fun02: Unit ={
    println(age)
    super.fun01
  }
}