package com.seekar.dagger_hilt_concept.examples.car

import android.util.Log
import com.seekar.dagger_hilt_concept.examples.MainActivity
import javax.inject.Inject

class Clutch {
    @Inject
    constructor() {
        Log.d(MainActivity.TAG, ": Clutch is ready")

    }


}