package com.simuchand.mybuddy.v3.data

import com.simuchand.mybuddy.v3.R
import com.simuchand.mybuddy.v3.model.BuddyModel

class BuddyData {
    fun loadBuddyList(): List<BuddyModel> {
        return listOf(
            BuddyModel(
                1,
                1,
                R.string.buddy_name_1,
                R.string.buddy_tag_line_1,
                "null",
            ),
            BuddyModel(
                2,
                2,
                R.string.buddy_name_2,
                R.string.buddy_tag_line_2,
                R.drawable.ic_buddy_profile_1.toString(),
            ),
            BuddyModel(
                2,
                3,
                R.string.buddy_name_3,
                R.string.buddy_tag_line_3,
                R.drawable.ic_buddy_profile_2.toString(),
            ),
            BuddyModel(
                1,
                4,
                R.string.buddy_name_4,
                R.string.buddy_tag_line_4,
                "null",
            ),
            BuddyModel(
                2,
                5,
                R.string.buddy_name_5,
                R.string.buddy_tag_line_5,
                R.drawable.ic_buddy_profile_3.toString(),
            ),
            BuddyModel(
                1,
                6,
                R.string.buddy_name_6,
                R.string.buddy_tag_line_6,
                "null",
            ),
            BuddyModel(
                1,
                7,
                R.string.buddy_name_7,
                R.string.buddy_tag_line_7,
                "null",
            ),
            BuddyModel(
                2,
                8,
                R.string.buddy_name_8,
                R.string.buddy_tag_line_8,
                R.drawable.ic_buddy_profile_4.toString(),
            ),
            BuddyModel(
                2,
                9,
                R.string.buddy_name_9,
                R.string.buddy_tag_line_9,
                R.drawable.ic_buddy_profile_2.toString(),
            ),
            BuddyModel(
                2,
                10,
                R.string.buddy_name_10,
                R.string.buddy_tag_line_10,
                R.drawable.ic_buddy_profile_1.toString(),
            ),
        )
    }
}