package com.example.kotlinhw2

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.io.Serializable

@Parcelize
data class UserModel(
    val name: String,
    val email: String,
    val password: String
) : Parcelable
