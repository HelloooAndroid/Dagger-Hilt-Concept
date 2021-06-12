package com.seekar.dagger_hilt_concept.viewmodel_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.seekar.dagger_hilt_concept.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MyActivity_ViewModelExample : AppCompatActivity() {


    val viewModel:ExampleViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewmodel_ex)

       // println(TAG + userViewModel.getUserData())
    }

    companion object {
        private const val TAG="TAG_MyActivity_ViewModelExample: "
    }
}