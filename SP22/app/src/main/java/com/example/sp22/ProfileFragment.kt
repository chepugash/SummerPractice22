package com.example.sp22

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.sp22.databinding.FragmentProfileBinding

class ProfileFragment : Fragment(R.layout.fragment_profile) {
    var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentProfileBinding.bind(view)

        with (binding) {
            btnPhotos.setOnClickListener {
                findNavController().navigate(
                    R.id.action_profileFragment_to_photosFragment,
                    PhotosFragment.createBundle((tvProfile.text ?: "Error").toString()))
            }
        }
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}