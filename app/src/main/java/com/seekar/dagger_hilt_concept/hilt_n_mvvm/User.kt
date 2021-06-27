package com.seekar.dagger_hilt_concept.hilt_n_mvvm

import com.google.gson.annotations.SerializedName


data class User(
    @SerializedName("name")
    var Name:String,

    @SerializedName("address")
    var Address:String
)