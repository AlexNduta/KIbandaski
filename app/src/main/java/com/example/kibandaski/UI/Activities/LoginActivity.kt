package com.example.kibandaski.UI.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kibandaski.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var _binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding= ActivityLoginBinding.inflate(layoutInflater)
        val _view= _binding.root

        setContentView(_view)
        //Hide the actionbar on the splashscreen
        supportActionBar?.hide()

        _binding.tvsignUp.setOnClickListener {
            val _intent= Intent(this, RegisterActivity::class.java)
            startActivity(_intent)
        }
    }
}