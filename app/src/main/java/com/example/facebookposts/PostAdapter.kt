package com.example.facebookposts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

open class PostAdapter(private val postLists: List<PostDM>) :
    RecyclerView.Adapter<PostViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.post_layout, parent, false)
        return PostViewHolder(view)
    }

    override fun getItemCount(): Int {
        return postLists.size
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val currentPost = postLists[position]
        holder.userNameTextView.text = currentPost.userName
        holder.postTextView.text = currentPost.postText
        holder.userImageView.setImageResource(currentPost.userImageId)
        holder.postImageView.setImageResource(currentPost.postImageId)
    }
}