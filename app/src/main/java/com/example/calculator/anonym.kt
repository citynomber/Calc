package com.example.calculator

import kotlin.math.PI

interface Area {

    fun area(): Double
}

abstract class Shape(
    val width: Int,
    val height: Int,
): Area {

}

class Rectangle(width: Int, height: Int): Shape(width, height) {

    override fun area(): Double {
        return width * height.toDouble()
    }
}

class Circle(x: Int, y: Int, val radius: Int): Shape(radius  * 2, radius * 2) {

    override fun area(): Double {
        return PI * radius * radius
    }
}