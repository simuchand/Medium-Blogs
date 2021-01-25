package com.simuchand.mybuddy.v1.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.simuchand.mybuddy.v1.R
import com.simuchand.mybuddy.v1.model.BuddyModel

class BuddyAdapter(
    private val context: Context,
    private val dataset: List<BuddyModel>
) : RecyclerView.Adapter<BuddyAdapter.ItemViewHolder>() {

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val buddyName: TextView = view.findViewById(R.id.buddy_name)
        val buddyTagLine: TextView = view.findViewById(R.id.buddy_tag_line)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.buddyName.text = context.resources.getString(item.buddyNameResourceId)
        holder.buddyTagLine.text = context.resources.getString(item.buddyTagLineResourceId)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}