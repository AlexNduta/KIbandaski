package com.example.kibandaski.UI.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kibandaski.R
import com.example.kibandaski.databinding.FragmentFavoriteBinding


class FavoriteFragment : Fragment() {

    private lateinit var _binding: FragmentFavoriteBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_favorite, container, false)

        _binding= FragmentFavoriteBinding.inflate(inflater, container, false)
        return _binding.root

       // _binding.fravoriteText.text= "this is my favourite Fragment"

    }


}