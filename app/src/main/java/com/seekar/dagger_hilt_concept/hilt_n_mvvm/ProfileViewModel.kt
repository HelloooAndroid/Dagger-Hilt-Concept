package com.seekar.dagger_hilt_concept.hilt_n_mvvm

import androidx.lifecycle.ViewModel
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel
@Inject constructor(
    val printingClass: PrintingClass,
    private val gson: Gson
) : ViewModel() {

    fun getProfileData(): User {
        //We are not introducing repository and network call here...
        // Assume we are getting data in json from network call...
        var data = "{\n" +
                "  \"name\": \"Pratim\",\n" +
                "  \"address\": \"Navi Mumbai\"\n" +
                "}"
        printingClass.printData(data)
        return gson.fromJson(data, User::class.java)
    }
}