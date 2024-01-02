package com.example.facebookposts

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val userNameTextView: TextView = itemView.findViewById(R.id.userNameTextView)
    val postTextView: TextView = itemView.findViewById(R.id.postTextView);
    val userImageView: CircleImageView = itemView.findViewById(R.id.userImage)
    val postImageView: ImageView = itemView.findViewById(R.id.postImage)
}