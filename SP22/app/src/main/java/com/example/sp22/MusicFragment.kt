package com.example.sp22

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.sp22.databinding.FragmentMusicBinding

class MusicFragment : Fragment(R.layout.fragment_music) {
    var _binding: FragmentMusicBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMusicBinding.bind(view)

        with (binding) {
            btnPhotos.setOnClickListener {
                findNavController().navigate(
                    R.id.action_musicFragment_to_photosFragment,
                    PhotosFragment.createBundle((tvMusic.text ?: "Error").toString()))
            }
        }
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}