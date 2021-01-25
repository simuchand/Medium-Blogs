package com.simuchand.mybuddy.v1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.simuchand.mybuddy.v1.adapter.BuddyAdapter
import com.simuchand.mybuddy.v1.data.BuddyData

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buddyDataset = BuddyData().loadBuddyList()
        val buddyRecyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        buddyRecyclerView.adapter = BuddyAdapter(this, buddyDataset)
        buddyRecyclerView.setHasFixedSize(true)
    }
}