package com.seekar.dagger_hilt_concept.hilt_n_mvvm

import android.util.Log
import javax.inject.Inject

class PrintingClass {

    @Inject
    constructor()
    fun printData(dataToPrint: String){
        Log.d("TAG_", "printData: $dataToPrint")
    }
}
