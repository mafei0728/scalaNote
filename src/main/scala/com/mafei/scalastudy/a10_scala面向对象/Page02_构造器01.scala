package com.mafei.scalastudy.a10_scala面向对象

/*
    @Classname Page01_构造器01
    @Description
    @author mafei0728
    @Date 2020/6/20 8:42
    @version 1.0
*/
class Page02_构造器01(val name:String, val age:Int) {
  var gender: String = _
  def this(gender:String){
    this("ma", 12)
    this.gender = gender
  }
}
