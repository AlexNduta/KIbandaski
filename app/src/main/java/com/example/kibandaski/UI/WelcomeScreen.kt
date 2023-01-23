package com.example.kibandaski.UI

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import com.example.kibandaski.R
import com.example.kibandaski.databinding.ActivityWelcomeScreenBinding

class WelcomeScreen : AppCompatActivity() {
private lateinit var _binding: ActivityWelcomeScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)
        _binding= ActivityWelcomeScreenBinding.inflate(layoutInflater)
        val view= _binding.root
        setContentView(view)
        //Hide the actionbar on the splashscreen
       supportActionBar?.hide()

        _binding.SignupBtn.setOnClickListener{
            val myIntent= Intent(this, RegisterActivity::class.java)
            startActivity(myIntent)
        }
        _binding.signinBtn.setOnClickListener{
            val myIntent= Intent(this, LoginActivity::class.java)
            startActivity(myIntent)
       }


    }
}
