package com.example.calculator

enum class DayOfWeek(
    val dayName: String,
) {
    Monday("monday"),
    Tuesday("tuesday"),
    Wednesday("wednesday"),
    Thursday("thursday"),
    Friday("friday"),
    Saturday("saturday"),
    Sunday("sunday");

    companion object {

        fun getByString(dayName: String): DayOfWeek? {

            return null
        }
    }
}

// -------------------------------------------------------------------------------

class Outer1 {

    fun foo(x: Int, y: Int) {
        class Coordinates(
            x: Int,
            y: Int
        )

        val coordinates = Coordinates(x, y)
    }

    class Nested {

        fun bar() {
        }
    }
}

class Parent {

    val name: String = "Natasha"
    private val age: Int = 34

    inner class Child {

        fun sayMotherName() {
            println("name is $name")
        }

        fun sayMothersAge() {
            println("age is $age")
        }
    }
}


fun main() {
    val parent = Parent()
    val child = parent.Child()

    child.sayMotherName()
    child.sayMothersAge()
}