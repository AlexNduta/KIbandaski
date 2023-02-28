package com.example.kibandaski.UI.Activities

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.kibandaski.R
import com.example.kibandaski.UI.Activities.BaseActivity
import com.example.kibandaski.UI.Fragments.FavoriteFragment
import com.example.kibandaski.UI.Fragments.HomeFragment
import com.example.kibandaski.UI.Fragments.ProfileFragment
import com.example.kibandaski.UI.Fragments.cartFragment
import com.example.kibandaski.databinding.ActivityHoldingBinding
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.lang.reflect.Array.newInstance

class HoldingActivity : BaseActivity() {
    //Initialise  the binding variable
    private lateinit var _binding: ActivityHoldingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityHoldingBinding.inflate(layoutInflater)
        val view = _binding.root
        setContentView(view)

//        supportActionBar?.hide()
//call the switch fragment and pass the firstragment(homefragment) as the destination fragment
        switchFragment(firstFragment)
_binding.bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

    }
    //initialise our fragments for ease of use
    val firstFragment = HomeFragment()
    val secondFragment = FavoriteFragment()
    val thirdFragment = cartFragment()
    val fourthFragment = ProfileFragment()


//the mOnavigationItemSelectedListener is initialised to the  BottonNavigation's OnNavigationItemSelected
    //the function listens to the icon that has been selected and passes the variable associated with the icon selected
    //then it navigates to it
  val  mOnNavigationItemSelectedListener =
    BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.Home -> {
                switchFragment(firstFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.favourite -> {
                switchFragment(secondFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.cart -> {
                switchFragment(thirdFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.profile -> {
                switchFragment(fourthFragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }



    fun switchFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fl_fragment, fragment)
            .commit()
    }


    //Enables us to doubleclick to exit
    override fun onBackPressed() {
        doubleBackExit()
    }
}