package com.simuchand.mybuddy.v3.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.simuchand.mybuddy.v3.R
import com.simuchand.mybuddy.v3.model.RemainderModel

class RemainderAdapter(
    private val context: Context,
    private val dataset: List<RemainderModel>
): RecyclerView.Adapter<RemainderAdapter.ItemViewHolder>() {

    class ItemViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val birthdayContent: TextView = view.findViewById(R.id.birthday_content)
        val firstMeetContent: TextView = view.findViewById(R.id.first_meet_content)
        val meetPlaceContent: TextView = view.findViewById(R.id.meet_place_content)
        val upcomingEventContent: TextView = view.findViewById(R.id.upcoming_event_content)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.remainder_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        contentController(holder.itemView ,holder.birthdayContent, position)
        contentController(holder.itemView ,holder.firstMeetContent, position)
        contentController(holder.itemView ,holder.meetPlaceContent, position)
        contentController(holder.itemView ,holder.upcomingEventContent, position)


    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    private fun contentController(view: View ,content:TextView, position: Int) {
        val place = dataset[position]

        when(content.resources.getResourceEntryName(content.id)) {
            "birthday_content" -> {
                if (place.birthdayContent == "null") {
                    view.findViewById<LinearLayout>(R.id.birthday_layout).visibility = View.GONE
                }
                else
                    content.text = place.birthdayContent
            }
            "first_meet_content" -> {
                if (place.firstMeetContent == "null") {
                    view.findViewById<LinearLayout>(R.id.first_meet_layout).visibility = View.GONE
                }
                else
                    content.text = place.firstMeetContent
            }
            "meet_place_content" -> {
                if (place.meetPlaceContent == "null") {
                    view.findViewById<LinearLayout>(R.id.meet_place_layout).visibility = View.GONE
                }
                else
                    content.text = place.meetPlaceContent
            }
            "upcoming_event_content" -> {
                if (place.upcomingEventContent == "null") {
                    view.findViewById<LinearLayout>(R.id.upcoming_event_layout).visibility = View.GONE
                }
                else
                    content.text = place.upcomingEventContent
            }
        }
    }
}