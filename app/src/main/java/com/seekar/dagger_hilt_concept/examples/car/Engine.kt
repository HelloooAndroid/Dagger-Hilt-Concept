package com.seekar.dagger_hilt_concept.examples.car

import android.util.Log
import com.seekar.dagger_hilt_concept.examples.MainActivity
import javax.inject.Inject

class Engine {

    @Inject
    constructor(clutch: Clutch, gear: Gear, breaks: Break) {
        Log.d(MainActivity.TAG, ": Engine is ready")
    }


}