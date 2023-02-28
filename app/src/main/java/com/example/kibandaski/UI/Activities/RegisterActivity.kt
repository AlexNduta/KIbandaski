package com.example.kibandaski.UI.Activities

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import androidx.appcompat.widget.Toolbar
import com.example.kibandaski.R
import com.example.kibandaski.databinding.ActivityRegisterBinding

class RegisterActivity : BaseActivity() {
    lateinit var _binding: ActivityRegisterBinding

    //@SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_register)

        _binding = ActivityRegisterBinding.inflate(layoutInflater)
        val _view = _binding.root
        setContentView(_view)
        //Hide the actionbar on the splashscreen
        supportActionBar?.hide()

        _binding.signinbigTv.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

        }

        setupActionBar()


        _binding.btnSignupBig.setOnClickListener {
           // validateRegisterDetails()
            val intent = Intent(this, HoldingActivity::class.java)
            startActivity(intent)
        }

    }

    //The function refrences the toolbar and attaches an Icon to it and initates the back navigation if pressed
    private fun setupActionBar() {
        val actionBar: Toolbar = _binding.toolbarRegisterActivity
        actionBar.setNavigationIcon(R.drawable.ic_black_color_back_24)
        actionBar.setNavigationOnClickListener { onBackPressed() }
    }

    //Function to validate the user input
    private fun validateRegisterDetails(): Boolean {
        return when {
            TextUtils.isEmpty(_binding.etName.text.toString().trim() { it <= ' ' }) -> {
                showErrorSnackBar(resources.getString(R.string.er_message_Name), true)
                false
            }
            TextUtils.isEmpty(_binding.etEmail.text.toString().trim() { it <= ' ' }) -> {
                showErrorSnackBar(resources.getString(R.string.er_message_Email), true)
                false

            }
            TextUtils.isEmpty(_binding.etPassword.text.toString().trim() { it <= ' ' }) -> {
                showErrorSnackBar(resources.getString(R.string.er_message_Password), true)
                false
            }

            else -> {showErrorSnackBar("Registry succesful", false)
            true}
        }

    }
}


