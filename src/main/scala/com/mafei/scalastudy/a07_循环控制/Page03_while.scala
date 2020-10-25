package com.mafei.scalastudy.a07_循环控制

/*
    @Classname Page03_while
    @Description
    @author mafei0728
    @Date 2020/6/17 22:35
    @version 1.0
*/
class Page03_while {
  def fun01: Unit = {
    var i = 10
    while (i <= 10) {
      i += 1
      println("---------")
    }
  }

  def fun02: Unit = {
    var i = 1
    do {
      i += 1
      println("-----")
    } while (i <= 10)
  }
}
