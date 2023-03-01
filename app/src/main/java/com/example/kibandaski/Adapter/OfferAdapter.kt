package com.example.kibandaski.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kibandaski.Models.Offers
import com.example.kibandaski.R
import com.example.kibandaski.databinding.ChildLayoutBinding
import com.example.kibandaski.databinding.OffersBinding

class OfferAdapter (val ImageItems: List<Offers>): RecyclerView.Adapter<OfferAdapter.offerViewHolder>() {


  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): offerViewHolder {
    val view= LayoutInflater.from(parent.context).inflate(R.layout.child_layout, parent, false)
    return offerViewHolder(view)
  }

  override fun onBindViewHolder(holder: offerViewHolder, position: Int) {
val imageItem= ImageItems[position]
    //holder.image.setImageResource(imageItem.offerImage)
holder._binding.apply {

  Glide.with(root).load(ImageItems[position].offerImage)
}

  }

  override fun getItemCount(): Int {
    return ImageItems.size
  }
  inner class offerViewHolder(item:View):RecyclerView.ViewHolder(item){
   // val image:ImageView= item.findViewById(R.id.offersImage)
    val _binding = OffersBinding.bind(item)

  }
}
