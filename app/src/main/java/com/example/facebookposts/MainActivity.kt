package com.example.facebookposts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewPosts)
        val postList = listOf(
            PostDM(
                ConstantValues.USER_1,
                ConstantValues.POST_1,
                R.drawable.profile,
                R.drawable.post
            ),
            PostDM(
                ConstantValues.USER_2,
                ConstantValues.POST_2,
                R.drawable.profile,
                R.drawable.post
            ),
            PostDM(
                ConstantValues.USER_3,
                ConstantValues.POST_3,
                R.drawable.profile,
                R.drawable.post
            ),
            PostDM(
                ConstantValues.USER_4,
                ConstantValues.POST_4,
                R.drawable.profile,
                R.drawable.post
            ),
            PostDM(
                ConstantValues.USER_5,
                ConstantValues.POST_5,
                R.drawable.profile,
                R.drawable.post
            )
        )
        recyclerView.layoutManager = LinearLayoutManager(this)
        val postAdapter: PostAdapter = PostAdapter(postList)
        recyclerView.adapter = postAdapter

    }
}