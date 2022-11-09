package com.example.calculator

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class DayOfWeekTest {

    @Test
    fun `return monday`() {
        val day = DayOfWeek.getByString("monday")

        assertEquals(DayOfWeek.Monday, day)
    }

    @Test
    fun `return tuesday`() {
        val day = DayOfWeek.getByString("tuesday")

        assertEquals(DayOfWeek.Tuesday, day)
    }


    @Test
    fun `return wednesday`() {
        val day = DayOfWeek.getByString("wednesday")

        assertEquals(DayOfWeek.Wednesday, day)
    }


    @Test
    fun `return thursday`() {
        val day = DayOfWeek.getByString("thursday")

        assertEquals(DayOfWeek.Thursday, day)
    }

    @Test
    fun `return friday`() {
        val day = DayOfWeek.getByString("friday")

        assertEquals(DayOfWeek.Friday, day)
    }


    @Test
    fun `return saturday`() {
        val day = DayOfWeek.getByString("saturday")

        assertEquals(DayOfWeek.Saturday, day)
    }

    @Test
    fun `return sunday`() {
        val day = DayOfWeek.getByString("sunday")

        assertEquals(DayOfWeek.Sunday, day)
    }

    @Test
    fun `return null`() {
        val day = DayOfWeek.getByString("")

        assertNull(day)
    }
}