package com.example.calculator

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout

class KeyboardView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
): LinearLayout(context, attrs, defStyleAttr) {

    fun interface KeyPressedListener {

        fun onKeyPressed(key: KeyboardKey)
    }

    private var keyPressedListener: KeyPressedListener? = null

    init {
        val inflater = LayoutInflater.from(context)
        inflater.inflate(R.layout.view_keyboard, this, true)
    }

    override fun onFinishInflate() {
        super.onFinishInflate()

        findViewById<View>(R.id.key_1).setOnClickListener {
            keyPressedListener?.onKeyPressed(KeyboardKey.Key1)
        }

        findViewById<View>(R.id.key_2).setOnClickListener {
            keyPressedListener?.onKeyPressed(KeyboardKey.Key2)
        }

        findViewById<View>(R.id.key_3).setOnClickListener {
            keyPressedListener?.onKeyPressed(KeyboardKey.Key3)
        }

        findViewById<View>(R.id.key_4).setOnClickListener {
            keyPressedListener?.onKeyPressed(KeyboardKey.Key4)
        }
    }

    fun setOnKeyPressedListener(listener: KeyPressedListener) {
        this.keyPressedListener = listener
    }
}