package com.simuchand.mybuddy.v3.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.simuchand.mybuddy.v3.R
import com.simuchand.mybuddy.v3.data.RemainderData
import com.simuchand.mybuddy.v3.model.BuddyModel
import com.simuchand.mybuddy.v3.model.RemainderModel

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

        //child recycler view
        val remainderRecyclerView: RecyclerView = view.findViewById(R.id.remainder_recycler_view)


        fun bind(position: Int) {
            val place = dataset[position]
            buddyName.text = context.resources.getString(place.buddyNameResourceId)
            buddyTagLine.text = context.resources.getString(place.buddyTagLineResourceId)

            //child recycler view adapter
            loadRemainder(place.remainderId, remainderRecyclerView)

        }
    }

    private inner class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val buddyName: TextView = view.findViewById(R.id.buddy_name)
        val buddyTagLine: TextView = view.findViewById(R.id.buddy_tag_line)
        val buddyImage: ImageView = view.findViewById(R.id.buddy_img)

        //child recycler view
        val remainderRecyclerView: RecyclerView = view.findViewById(R.id.remainder_recycler_view)

        fun bind(position: Int) {
            val place = dataset[position]
            buddyName.text = context.resources.getString(place.buddyNameResourceId)
            buddyTagLine.text = context.resources.getString(place.buddyTagLineResourceId)
            buddyImage.setImageResource(place.buddyImgResourceId.toInt())

            //child recycler view adapter
            loadRemainder(place.remainderId, remainderRecyclerView)
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
        when (dataset[position].ViewType) {
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

    fun loadRemainder(remainderID: Int, remainderRecyclerView: RecyclerView) {
        when (remainderID) {
            1 -> {
                val remainderDataset = RemainderData().loadRemainder1()
                remainderRecyclerView.adapter = RemainderAdapter(context, remainderDataset)
            }
            2 -> {
                val remainderDataset = RemainderData().loadRemainder2()
                remainderRecyclerView.adapter = RemainderAdapter(context, remainderDataset)
            }
            3 -> {
                val remainderDataset = RemainderData().loadRemainder3()
                remainderRecyclerView.adapter = RemainderAdapter(context, remainderDataset)
            }
            4 -> {
                val remainderDataset = RemainderData().loadRemainder4()
                remainderRecyclerView.adapter = RemainderAdapter(context, remainderDataset)
            }
            5 -> {
                val remainderDataset = RemainderData().loadRemainder5()
                remainderRecyclerView.adapter = RemainderAdapter(context, remainderDataset)
            }
            6 -> {
                val remainderDataset = RemainderData().loadRemainder6()
                remainderRecyclerView.adapter = RemainderAdapter(context, remainderDataset)
            }
            7 -> {
                val remainderDataset = RemainderData().loadRemainder7()
                remainderRecyclerView.adapter = RemainderAdapter(context, remainderDataset)
            }
            8 -> {
                val remainderDataset = RemainderData().loadRemainder8()
                remainderRecyclerView.adapter = RemainderAdapter(context, remainderDataset)
            }
            9 -> {
                val remainderDataset = RemainderData().loadRemainder9()
                remainderRecyclerView.adapter = RemainderAdapter(context, remainderDataset)
            }
            10 -> {
                val remainderDataset = RemainderData().loadRemainder10()
                remainderRecyclerView.adapter = RemainderAdapter(context, remainderDataset)
            }
        }
    }
}