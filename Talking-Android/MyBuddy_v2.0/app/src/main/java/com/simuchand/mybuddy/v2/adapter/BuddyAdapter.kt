package com.simuchand.mybuddy.v2.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.simuchand.mybuddy.v2.R
import com.simuchand.mybuddy.v2.model.BuddyModel

class BuddyAdapter(
    private val context: Context,
    private val dataset: List<BuddyModel>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        const val VIEW_TYPE_TEXT = 1
        const val VIEW_TYPE_IMAGE = 2
    }

    private inner class TextViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val buddyName: TextView = view.findViewById(R.id.buddy_name)
        val buddyTagLine: TextView = view.findViewById(R.id.buddy_tag_line)

        fun bind(position: Int) {
            val place = dataset[position]
            buddyName.text = context.resources.getString(place.buddyNameResourceId)
            buddyTagLine.text = context.resources.getString(place.buddyTagLineResourceId)
        }
    }

    private inner class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val buddyName: TextView = view.findViewById(R.id.buddy_name)
        val buddyTagLine: TextView = view.findViewById(R.id.buddy_tag_line)
        val buddyImage: ImageView = view.findViewById(R.id.buddy_img)

        fun bind(position: Int) {
            val place = dataset[position]
            buddyName.text = context.resources.getString(place.buddyNameResourceId)
            buddyTagLine.text = context.resources.getString(place.buddyTagLineResourceId)
            buddyImage.setImageResource(place.buddyImgResourceId.toInt())
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == VIEW_TYPE_TEXT) {
            return TextViewHolder(
                LayoutInflater.from(context)
                    .inflate(R.layout.text_item_layout, parent, false)
            )
        }
        return ImageViewHolder(
            LayoutInflater.from(context)
                .inflate(R.layout.image_item_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(dataset[position].ViewType) {
            VIEW_TYPE_TEXT -> (holder as TextViewHolder).bind(position)
            VIEW_TYPE_IMAGE -> (holder as ImageViewHolder).bind(position)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return dataset[position].ViewType
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}