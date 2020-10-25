package com.mafei.scalastudy.a07_循环控制

/*
    @Classname Page04_contiune_break
    @Description
    @author mafei0728
    @Date 2020/6/17 22:42
    @version 1.0
*/
class Page04_continue_break {
  def fun01: Unit = {
    //continue
    for (i <- 1 to 10 if i % 2 == 0) {
      println("----------")
    }

    // break
    var j = true
    for (i <- 1 to 10 if j) {
      if (i == 2) {
        j = false
      }
    }
  }

  import util.control.Breaks._

  def fun02: Unit = {
    breakable {
      for (i <- 1 to 10) {
        if (i == 2) {
          break()
        }
        println("ok")
      }
    }
  }

}
