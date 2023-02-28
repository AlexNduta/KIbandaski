package com.example.kibandaski.UI.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.kibandaski.R
import com.google.android.material.snackbar.Snackbar

open class BaseActivity : AppCompatActivity() {

    private var doublbackToExitPressedOnce= false

fun showErrorSnackBar(message:String, errorMessage: Boolean){
    //create a snackbar
    val snackbar= Snackbar.make(findViewById(androidx.appcompat.R.id.content), message, Snackbar.LENGTH_LONG )
    val snackbarView= snackbar.view

    if (errorMessage){
        snackbarView.setBackgroundColor(
            ContextCompat.getColor(this, R.color.snackbarFailure)
        )
    }else {
        snackbarView.setBackgroundColor(ContextCompat.getColor(this, R.color.snackbarSucess))
    }

}

    //used to confirm the exit option

    fun doubleBackExit(){
        if (doublbackToExitPressedOnce){
            super.onBackPressed()
        return
        }
        this.doublbackToExitPressedOnce= true

        Toast.makeText(this, resources.getString(R.string.exit_again), Toast.LENGTH_SHORT)
            .show()
        Handler().postDelayed({doublbackToExitPressedOnce= false}, 2000)
    }
}

