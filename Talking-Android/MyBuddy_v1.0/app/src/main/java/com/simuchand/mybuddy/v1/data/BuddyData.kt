package com.simuchand.mybuddy.v1.data

import com.simuchand.mybuddy.v1.R
import com.simuchand.mybuddy.v1.model.BuddyModel

class BuddyData {
    fun loadBuddyList(): List<BuddyModel> {
        return listOf(
            BuddyModel(
                R.string.buddy_name_1,
                R.string.buddy_tag_line_1,
            ),
            BuddyModel(
                R.string.buddy_name_2,
                R.string.buddy_tag_line_2,
            ),
            BuddyModel(
                R.string.buddy_name_3,
                R.string.buddy_tag_line_3,
            ),
            BuddyModel(
                R.string.buddy_name_4,
                R.string.buddy_tag_line_4,
            ),
            BuddyModel(
                R.string.buddy_name_5,
                R.string.buddy_tag_line_5,
            ),
            BuddyModel(
                R.string.buddy_name_6,
                R.string.buddy_tag_line_6,
            ),
            BuddyModel(
                R.string.buddy_name_7,
                R.string.buddy_tag_line_7,
            ),
            BuddyModel(
                R.string.buddy_name_8,
                R.string.buddy_tag_line_8,
            ),
            BuddyModel(
                R.string.buddy_name_9,
                R.string.buddy_tag_line_9,
            ),
            BuddyModel(
                R.string.buddy_name_10,
                R.string.buddy_tag_line_10,
            ),
        )
    }
}