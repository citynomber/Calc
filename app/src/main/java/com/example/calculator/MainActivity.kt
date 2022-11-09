package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

private const val KEY_COUNTER = "counter"

class MainActivity : AppCompatActivity() {

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState != null) {
            counter = savedInstanceState.getInt(KEY_COUNTER)
        }

        Log.v("delizarov", "on created ${hashCode()}")

        with(findViewById<TextView>(R.id.tv)) {
            text = counter.toString()

            setOnClickListener {
                ++counter

                (it as TextView).text = counter.toString()
            }
        }
    }

    override fun onStart() {
        super.onStart()

        Log.v("delizarov", "on started ${hashCode()}")
    }

    override fun onResume() {
        super.onResume()

        Log.v("delizarov", "on resumed ${hashCode()}")
    }

    override fun onPause() {
        super.onPause()

        Log.v("delizarov", "on paused ${hashCode()}")
    }

    override fun onStop() {
        super.onStop()

        Log.v("delizarov", "on stop ${hashCode()}")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.v("delizarov", "on destroyed ${hashCode()}")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        Log.v("delizarov", "on save instance state")

        outState.putInt(KEY_COUNTER, counter)
    }
}