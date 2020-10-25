package com.mafei.scalastudy.a16_scala中包的引入


/*
    @Classname Page01
    @Description
    @author mafei0728
    @Date 2020/7/4 20:10
    @version 1.0
*/
class Page01 {
  import scala.beans.BeanProperty
  @BeanProperty var name = "mafei"
  def fun01: Unit = {
    println(getName)
  }
}