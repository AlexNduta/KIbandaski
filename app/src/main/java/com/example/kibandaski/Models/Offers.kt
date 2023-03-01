package com.example.kibandaski.Models

import com.example.kibandaski.R

data class Offers(
    val offerImage:Int
)
 object fakeDataStore{

     private val OfferItems= listOf(
         Offers(R.drawable.e1),
         Offers(R.drawable.e2),
         Offers(R.drawable.e3),
         Offers(R.drawable.e4),
         Offers(R.drawable.e1),
         Offers(R.drawable.e2),
         Offers(R.drawable.e3),
         Offers(R.drawable.e4)
     )

     fun getOfferItems():List<Offers>{
         return  OfferItems
     }
 }