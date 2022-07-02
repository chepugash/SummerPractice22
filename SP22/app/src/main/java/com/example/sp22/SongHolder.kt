package com.example.sp22

import androidx.recyclerview.widget.RecyclerView
import com.example.sp22.databinding.ItemMainBinding

class SongHolder(private val binding: ItemMainBinding) : RecyclerView.ViewHolder(binding.root) {
    fun onBind(song: Song) {
        with (binding) {
            tvName.text = song.name
            tvAuthor.text = song.author
        }
    }
}