package com.simuchand.mybuddy.v3.model

import androidx.annotation.StringRes

data class BuddyModel(
    val ViewType: Int,
    val remainderId: Int,
    @StringRes val buddyNameResourceId: Int,
    @StringRes val buddyTagLineResourceId: Int,
    val buddyImgResourceId: String,
)
