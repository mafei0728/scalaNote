package com.mafei.scalastudy.a14_scala的权限修饰符

/*
    @Classname Page01
    @Description
    @author mafei0728
    @Date 2020/7/4 19:43
    @version 1.0
*/
class Page01 {
  // 本来是私有方法,同过包的权限扩大访问换位
  private[mafei] val name = "mafei"
  private[mafei] def fun01: Unit ={
    print("私有方法")
  }
}

package mafei{
  object Test01 extends App{
    val p = new Page01;
    println(p.name)
    p.fun01
  }
}