package com.example.sp22

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.example.sp22.databinding.ItemCityBinding

class CityHolder(
    private val binding: ItemCityBinding,
    private val glide: RequestManager,
    private val onItemClick: (City) -> Unit,
) : RecyclerView.ViewHolder(binding.root) {

    fun onBind(city: City) {
        with (binding) {
            tvCity.text = city.name
            tvCountry.text = city. country
            root.setOnClickListener {
                onItemClick(city)
            }
            glide.load(city.url).into(ivCover)
        }
    }
}