package com.example.sp22

import androidx.recyclerview.widget.RecyclerView
import com.example.sp22.databinding.ItemMainBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions

class SongHolder(
    private val binding: ItemMainBinding,
    private val glide: RequestManager,
    private val onItemClick: (Song) -> Unit,
    ) : RecyclerView.ViewHolder(binding.root) {

    private val options: RequestOptions = RequestOptions()
        .diskCacheStrategy((DiskCacheStrategy.AUTOMATIC))

    fun onBind(song: Song) {
        with (binding) {
            tvName.text = song.name
            tvAuthor.text = song.author
            root.setOnClickListener {
                onItemClick(song)
            }
            glide.load(song.url).into(ivCover)
        }
    }
}