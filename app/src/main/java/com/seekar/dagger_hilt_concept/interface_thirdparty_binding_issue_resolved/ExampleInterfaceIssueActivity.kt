package com.seekar.dagger_hilt_concept.interface_thirdparty_binding_issue_resolved

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.seekar.dagger_hilt_concept.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ExampleInterfaceIssueActivity : AppCompatActivity() {
    
    companion object {
        const val TAG = "TAG_ScopeActivity: "
    }

    @Inject
    lateinit var someClass: SomeClass


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       println(TAG + someClass.getMyData())


    }

}

