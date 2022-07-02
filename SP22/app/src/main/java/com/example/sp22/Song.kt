package com.example.sp22

data class Song(
    val id: Int,
    val name: String,
    val author: String,
    var url: String = "https://media.giphy.com/media/MDJ9IbxxvDUQM/giphy.gif") {
}
