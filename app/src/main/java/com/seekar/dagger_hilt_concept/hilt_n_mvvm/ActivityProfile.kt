package com.seekar.dagger_hilt_concept.hilt_n_mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import com.seekar.dagger_hilt_concept.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity__profile.*

@AndroidEntryPoint
class ActivityProfile : AppCompatActivity() {

    private val profileViewModel: ProfileViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__profile)

        ViewModelProvider(this).get(ProfileViewModel::class.java)

        val user = profileViewModel.getProfileData()
        profileData.text = user.Name +"\n"+user.Address
    }
}