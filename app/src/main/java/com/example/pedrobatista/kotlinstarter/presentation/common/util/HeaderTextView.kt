package com.example.pedrobatista.kotlinstarter.presentation.common.util

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.util.AttributeSet
import android.widget.TextView


class HeaderTextView : TextView {
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)

    init {
        applyCustomFont()
    }

    private fun applyCustomFont() {
        val customFont = Typeface.createFromAsset(context.assets, "fonts/nunito-bold.ttf")
        setTypeface(customFont)
        setTextColor(Color.parseColor("#ffffff"))
    }
}