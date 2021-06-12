package com.seekar.dagger_hilt_concept.examples.car

import android.util.Log
import com.seekar.dagger_hilt_concept.examples.MainActivity.Companion.TAG
import javax.inject.Inject

class Wheels {
    @Inject
    constructor() {
        Log.d(TAG, ": Wheels are ready")
    }


}