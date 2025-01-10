package com.example.kotlinhw2

import java.io.Serializable

data class UserModel(
    private val name: String,
    private val email: String,
    private val password: String
) : Serializable
