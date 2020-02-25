package com.knoldus.approach1

trait Quadrilateral {

  var length: Double = 0
  var breadth: Double = 0

  def getHeight: Double = length

  def getWidth: Double = breadth

  def setWidth(width: Double)

  def setHeight(height: Double)

  def area: Double = length * breadth
}
