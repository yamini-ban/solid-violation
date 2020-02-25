package com.knoldus.approach1

class Rectangle extends Quadrilateral {

  def this(length: Int, breadth: Int) {
    this
    setHeight(length)
    setWidth(breadth)
  }

  def setHeight(length: Double): Unit = this.length = length

  def setWidth(breadth: Double): Unit = this.breadth = breadth

}
