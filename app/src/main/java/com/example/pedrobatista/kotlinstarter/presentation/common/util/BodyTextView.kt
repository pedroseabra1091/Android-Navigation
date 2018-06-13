package com.example.pedrobatista.kotlinstarter.presentation.common.util

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.widget.TextView


class BodyTextView : TextView {
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)

    init {
        applyCustomFont()
    }

    private fun applyCustomFont() {
        val customFont = Typeface.createFromAsset(context.assets, "fonts/open-sans-light.ttf")
        setTypeface(customFont)
    }
}