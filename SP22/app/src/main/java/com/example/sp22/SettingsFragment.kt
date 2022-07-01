package com.example.sp22

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.sp22.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment(R.layout.fragment_settings) {
    var _binding: FragmentSettingsBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSettingsBinding.bind(view)

        with (binding) {
            btnPhotos.setOnClickListener {
                findNavController().navigate(
                    R.id.action_settingsFragment_to_photosFragment,
                    PhotosFragment.createBundle((tvSettings.text ?: "Error").toString()))
            }
        }
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}