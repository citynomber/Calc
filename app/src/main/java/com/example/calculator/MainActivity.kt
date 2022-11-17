package com.example.calculator

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

// https://www.figma.com/file/xkvarloxKITc59nVeQezuW/Neumorph-Calc?t=SmBdUmT9pnaaA1RF-0

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val expressionView = findViewById<TextView>(R.id.expression_view)

        findViewById<KeyboardView>(R.id.keyboard).setOnKeyPressedListener { key ->
            expressionView.text = when(key) {
                KeyboardKey.Key1 -> "1"
                KeyboardKey.Key2 -> "2"
                KeyboardKey.Key3 -> "3"
                KeyboardKey.Key4 -> "4"
            }
        }
    }

}
