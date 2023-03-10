package com.example.kibandaski.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton

class MyButton(context: Context, attr:AttributeSet):AppCompatButton(context,attr){
    init {
        applyFont()
    }

    private fun applyFont(){
        val typeface:Typeface= Typeface.createFromAsset(context.assets, "Open-Sans-Bold")
        setTypeface(typeface)
    }

}