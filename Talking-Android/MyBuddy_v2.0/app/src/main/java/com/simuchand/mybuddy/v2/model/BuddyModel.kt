package com.simuchand.mybuddy.v2.model

import androidx.annotation.StringRes

data class BuddyModel(
    val ViewType: Int,
    @StringRes val buddyNameResourceId: Int,
    @StringRes val buddyTagLineResourceId: Int,
    val buddyImgResourceId: String,
)
