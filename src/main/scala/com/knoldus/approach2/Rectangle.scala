package com.knoldus.approach2

class Rectangle extends Area {
  var length: Double = 0
  var breadth: Double = 0
  def this(length: Double, breadth: Double) {
    this()
    setLength(length)
    setBreadth(breadth)
  }
  def setBreadth(breadth: Double): Unit = this.breadth = breadth

  def setLength(length: Double): Unit = this.length = length

  override def area: Double = length * breadth
}
