package com.seekar.dagger_hilt_concept.scope_idea

import android.os.Bundle
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MyFragment: Fragment(){

    companion object {
        const val TAG = "TAG_MyFragment: "
    }

    @Inject
    lateinit var fragmentScopeClass: FragmentScopeClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //println(TAG + fragmentScopeClass.doAThing())
    }

}
