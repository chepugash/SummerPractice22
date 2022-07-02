package com.example.sp22

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.example.sp22.databinding.ItemMainBinding

class SongAdapter(
    private val list: List<Song>,
    private val glide: RequestManager,
    private val onItemClick: (Song) -> Unit,
    ) : RecyclerView.Adapter<SongHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
        ): SongHolder = SongHolder(ItemMainBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ),
    glide = glide,
    onItemClick,
    )

    override fun onBindViewHolder(holder: SongHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size


}