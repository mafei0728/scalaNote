package com.mafei.scalastudy.a28_样例类与模式匹配

/*
    @Classname Expr
    @Description
    @author mafei0728
    @Date 2020/9/1 21:49
    @version 1.0
*/
abstract class Expr

case class Var(name: String) extends Expr

case class Number(num: Double) extends Expr

case class UnOp(operator: String, arg: Expr) extends Expr

case class BigOp(operation: String, left: Expr, right: Expr) extends Expr

case class TestCaseClass(a: String, b: String)

object TestObject01 {
  val a = 12
  var b: Int = 123

  def main(args: Array[String]): Unit = {
    fun05(UnOp("abs", UnOp("abs", Number(12))))
  }

  def fun01(a: TestCaseClass): Unit = {
    a match {
      case TestCaseClass(_, a) => println(a)
      case _ => println("ok")
    }
  }

  def fun02(t: Any): Unit = {
    t match {
      case 1 => println(1)
      case true => println(true)
      case None => println(None)
      case Nil => println(Nil)
      // 匹配val,不能匹配var
      case TestObject01.a => println(a); println("val")
      // 匹配变量,非属性
      case b => println(b)
      case _ => println("ok")
    }
  }

  def fun03(exp: Any): Unit = {
    exp match {
      case a: String => println(a.length)
      // 可以使用小写字母t或者_替代
      case a: Map[t, _] => println(a.size);
      case _ => println("Null")
    }
  }

  def fun04(exp: Any): Unit = {
    exp match {
      case a: List[Int] => println("list")
      case b: Array[Int] => println(b.length)
      case _ => println("ok")
    }
  }

  def fun05(exp: Expr) {
    exp match {
      case UnOp("abs", a @ UnOp("abs", _)) => println(a)
    }

  }
}