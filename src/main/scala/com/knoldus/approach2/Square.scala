package com.knoldus.approach2

class Square extends Area {
  var side: Double = 0
  def this(side: Double) {
    this()
    this.side = side
  }
  def setSide(newSide: Double): Unit = {
    this.side = newSide
  }

  def area: Double = side * side

}
