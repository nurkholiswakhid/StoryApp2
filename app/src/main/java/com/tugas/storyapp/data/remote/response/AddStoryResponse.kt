package com.tugas.storyapp.data.remote.response

import com.google.gson.annotations.SerializedName

class AddStoryResponse (
    @field:SerializedName("error")
    val error: Boolean = false,

    @field:SerializedName("message")
    val message: String = ""
    )