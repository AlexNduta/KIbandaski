package com.example.kibandaski.UI.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kibandaski.R
import com.example.kibandaski.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {

    private lateinit var _binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
    //return inflater.inflate(R.layout.fragment_profile, container, false)

   _binding= FragmentProfileBinding.inflate(inflater, container, false)
        return _binding.root

       // _binding.profileText.text= "This is the profile fragment"

    }


}