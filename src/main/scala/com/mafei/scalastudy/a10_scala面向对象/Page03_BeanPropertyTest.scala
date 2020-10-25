package com.mafei.scalastudy.a10_scala面向对象

/*
    @Classname Page03_BeanPropetryTest
    @Description
    @author mafei0728
    @Date 2020/6/28 22:04
    @version 1.0
*/

import scala.beans.BeanProperty

class Page03_BeanPropertyTest(@BeanProperty val name: String) {
  @BeanProperty var score:Int = _
  def this(name:String ,score:Int){
    this(name)
    this.score = score
  }
}

object Page03_BeanPropertyTest extends App{
  val p = new Page03_BeanPropertyTest("mafei0728", 88888888)
  println(p.getName)
  println(p.getScore)
  p.setScore(9999999)
  p.score
  p.name
}
