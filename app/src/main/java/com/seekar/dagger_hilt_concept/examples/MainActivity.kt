package com.seekar.dagger_hilt_concept.examples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.seekar.dagger_hilt_concept.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    companion object {
        const val TAG = "TAG_MainActivity: "
    }

    //@Inject
    //lateinit var someClass: SomeClass     //Ex-1

    //@Inject       //Field Injection
    //lateinit var car: Car                 //Ex-2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //println(TAG + someClass.doAThing())   //Ex-1

        //println(TAG + car.drive())            //Ex-2

    }

}

