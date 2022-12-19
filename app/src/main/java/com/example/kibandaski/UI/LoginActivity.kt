package com.example.kibandaski.UI

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kibandaski.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //Hide the actionbar on the splashscreen
        supportActionBar?.hide()

    }

}