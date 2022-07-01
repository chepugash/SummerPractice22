package com.example.sp22

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.sp22.databinding.FragmentChatBinding

class ChatFragment : Fragment(R.layout.fragment_chat) {
    var _binding: FragmentChatBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentChatBinding.bind(view)

        with (binding) {
            btnPhotos.setOnClickListener {
                findNavController().navigate(
                    R.id.action_chatFragment_to_photosFragment,
                    PhotosFragment.createBundle((tvChat.text ?: "Error").toString()))
            }
        }
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}