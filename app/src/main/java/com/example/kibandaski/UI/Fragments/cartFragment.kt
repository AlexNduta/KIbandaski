package com.example.kibandaski.UI.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kibandaski.R
import com.example.kibandaski.databinding.FragmentCartBinding


class cartFragment : Fragment() {

   private lateinit var _binding: FragmentCartBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?



    ): View? {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_cart, container, false)

        _binding= FragmentCartBinding.inflate(inflater, container, false)
        return _binding.root

//_binding.mycartText.text="This is a cart Fragment"

    }


}