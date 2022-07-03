package com.example.sp22

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.edit
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.sp22.CityRepository.cities
import com.example.sp22.databinding.FragmentDetailsBinding
import com.example.sp22.databinding.FragmentMainBinding
import com.google.android.material.snackbar.Snackbar

class DetailsFragment : Fragment(R.layout.fragment_details) {
    private var _binding: FragmentDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        _binding = FragmentDetailsBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)

        val args by navArgs<DetailsFragmentArgs>()
        val text = args.argument

        with(binding) {
            tvDetailId.text = "Id: ${cities[text].id.toString()}"
            tvDetailCity.text = "Name: ${cities[text].name}"
            tvDetailCountry.text = "Country: ${cities[text].country}"
            Glide.with(this@DetailsFragment).load(cities[text].url).into(ivPic)
        }


    }


}