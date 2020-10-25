package com.mafei.scalastudy.a18_超类的构造

/*
 * @Description
 * @Author  mafei0728
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/7/5
 */
object Page01 extends App{
  val s = new WhStudent("mafei", 999999999, "武汉")


}


class Student(var name:String){
  println("01调用父类主构造器")
  var age:Int = _
  def this(name:String, age:Int){
    this(name)
    this.age = age
    println("02调用父类辅助构造器")
  }
}

class WhStudent(name:String, age:Int) extends Student(name, age) {
  var address:String = _
  println("03调用子类主构造器")
  def this(name:String, age:Int, address:String){
    this(name,age)
    this.address = address
    println("04调用子类辅助构造器")
  }
}
