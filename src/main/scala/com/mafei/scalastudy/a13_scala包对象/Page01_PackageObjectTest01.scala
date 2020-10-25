package com.mafei.scalastudy.a13_scala包对象

/*
    @Classname Page01_PackageObjectTest01
    @Description
    @author mafei0728
    @Date 2020/7/4 19:16
    @version 1.0
*/
package object mafei{
  val name:String = "mafei"
  def printName: Unit ={
    println(name)
  }
}

package mafei {
  class Page01_PackageObjectTest01 {
    // 类中使用包对象
    def fun01:String = {
      printName
      name
    }
  }

  object Object01 extends App{
    // 对象中使用包对象
    def fun02: Unit ={
      printName
      print(name)
    }
  }

}
