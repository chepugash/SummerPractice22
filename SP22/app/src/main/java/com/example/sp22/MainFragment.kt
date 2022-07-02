package com.example.sp22

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.animation.GridLayoutAnimationController
import androidx.core.content.edit
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import com.example.sp22.databinding.FragmentMainBinding
import com.google.android.material.snackbar.Snackbar

class MainFragment : Fragment(R.layout.fragment_main) {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    private var adapter: SongAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainBinding.bind(view)

        val text = arguments?.getString("ARG_TEXT",).orEmpty()

        initAdapter()
    }

    private fun initAdapter() {
        adapter = SongAdapter(SongRepository.songs,
            Glide.with(this)) {
            Snackbar.make(
                binding.root,
                "Song id: ${it.id}",
                Snackbar.LENGTH_LONG
            ).show()
        }
        binding.rvMain.adapter = adapter
        binding.rvMain.layoutManager = GridLayoutManager(requireContext(), 2)
    }

    private fun initPref() {
        val pref = activity?.getSharedPreferences("TEST", Context.MODE_PRIVATE) ?: return
        val value = pref.getString("PREF_TEXT", "error")
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}