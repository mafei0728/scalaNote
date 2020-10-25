package com.mafei.scalastudy.a17_scala面向对象三大特性.继承

/*
 * @Description
 * @Author  mafei0728
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/7/5
 */
object Page02_FiledOverRide extends App {
  val a01: A = new B
  val a02: B = new B
  // 调用属性,其实是调用方法
  a01.fun01
  println(a01.a)
}

class A {
  val a = 11
  var b = 23
  def c: Int ={
    23
  }
  def fun01: Unit ={
    println("父类的方法")
  }
}

class B extends A {
  // 实际是重写的底层的方法
  override val a: Int = 13
  // 重写不带参数的方法
  override def c: Int = super.c + 12
  // 只能重写val修饰的属性,var直接是修改
  b = 24
  override  def fun01: Unit ={
    println("子类重写的方法")
    super.fun01
    println(super.c)
  }
}