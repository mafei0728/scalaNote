package com.mafei.scalastudy.a26_map

import org.testng.annotations.Test

import scala.collection.immutable

/*
    @Classname PageTest01
    @Description
    @author mafei0728
    @Date 2020/8/2 23:52
    @version 1.0
*/
class PageTest01 {
  @Test
  def fun01(): Unit = {
    val a = immutable.Map("a" -> 1, "b" -> 2);
    val b = a + ("d" -> 3)
    val c = a("a")
  }

}
