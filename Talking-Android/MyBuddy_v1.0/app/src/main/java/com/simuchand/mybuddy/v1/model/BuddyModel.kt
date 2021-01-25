package com.simuchand.mybuddy.v1.model

import androidx.annotation.StringRes

data class BuddyModel(
    @StringRes val buddyNameResourceId: Int,
    @StringRes val buddyTagLineResourceId: Int,
)
