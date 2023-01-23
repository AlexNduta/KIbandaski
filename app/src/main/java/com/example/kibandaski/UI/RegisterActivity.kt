package com.example.kibandaski.UI

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.kibandaski.R
import com.example.kibandaski.R.drawable.ic_black_color_back_24
import com.example.kibandaski.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    lateinit var _binding : ActivityRegisterBinding
    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_register)

        _binding= ActivityRegisterBinding.inflate(layoutInflater)
        val _view= _binding.root
        setContentView(_view)
        //Hide the actionbar on the splashscreen
        supportActionBar?.hide()

        _binding.signinbigTv.setOnClickListener {
            val intent= Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

setupActionBar()


        }

    //The function refrences the toolbar and attaches an Icon to it and initates the back navigation if pressed
    private fun setupActionBar(){
        val actionBar:Toolbar = _binding.toolbarRegisterActivity
        actionBar.setNavigationIcon(R.drawable.ic_black_color_back_24)
        actionBar.setNavigationOnClickListener { onBackPressed() }
    }

    }



