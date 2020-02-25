package com.knoldus.approach1

class Square extends Quadrilateral {

  def this(side: Double) {
    this
    setHeight(side)
  }

  def setHeight(height: Double): Unit = {
    this.length = height
    this.breadth = height
  }

  def setWidth(width: Double): Unit = {
    this.length = width
    this.breadth = width
  }

}
