package com.mafei.scalastudy.a03_PrintFunction
//
/*
*
*
*
* */
/**
 *
 *
 *
 * */
import org.testng.annotations.Test

/*
 * @Description
 * @Author  mafei0728
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/6/13
 */
class Page01_PrintFunction {
  val name = "mafei"
  //字符串拼接
  @Test
  def StringConcat: Unit = {
    println("姓名:" + name)
  }

  //printf方法
  @Test
  def PrintFFunction: Unit ={
    printf("姓名:%s", name)
  }

  // 通过字符串$来引用
  @Test
  def Print$Function: Unit ={
    println(s"姓名:${name}")
    // 这种方法的好处是可以做运算
    println(s"res:${3+2}")
  }
}
