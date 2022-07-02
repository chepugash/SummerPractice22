package com.example.sp22

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.sp22.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    private var adapter: SongAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainBinding.bind(view)
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}