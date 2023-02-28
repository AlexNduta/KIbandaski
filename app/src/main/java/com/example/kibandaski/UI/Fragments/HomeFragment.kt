package com.example.kibandaski.UI.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kibandaski.Adapter.OfferAdapter
import com.example.kibandaski.Models.fakeDataStore
import com.example.kibandaski.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var _binding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//setHasOptionsMenu(false)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       // (activity as AppCompatActivity).supportActionBar?.show()
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_home, container, false)
        _binding= FragmentHomeBinding.inflate(layoutInflater, container, false)

        //Checks if our activity is null so that it can attach the action bar to our fragment
//        if (activity != null) {
//          (activity as AppCompatActivity).setSupportActionBar(_binding.HomeTopAppBar)
  //    }

       return _binding.root
        val iMageItems= fakeDataStore.getOfferItems()
        val adapter= OfferAdapter(iMageItems)
        _binding.rvFeaturedProducts.adapter


    }

    //Sets the menu options
//    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
//        super.onCreateOptionsMenu(menu, inflater)
//        inflater.inflate(R.menu.top_bar, menu)
//
//    }



}