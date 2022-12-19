package com.example.kibandaski.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

//create our bold fonstyle
class LightTextView(context: Context, attrs: AttributeSet): AppCompatTextView(context, attrs) {

    init {
        applyFont()

    }

    private fun applyFont(){
        val boldTypeface: Typeface = Typeface.createFromAsset(context.assets, "OpenSans-Light.ttf")
        typeface = boldTypeface

    }
}