package com.example.kibandaski.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView


//This is our custom edittext
class Edittext(context: Context, attr:AttributeSet):AppCompatEditText(context, attr) {

    init {
        applyfont()
    }
    private fun applyfont(){
        val typeface: Typeface = Typeface.createFromAsset(context.assets,"OpenSans-Regular.ttf")
        setTypeface(typeface)
    }
}