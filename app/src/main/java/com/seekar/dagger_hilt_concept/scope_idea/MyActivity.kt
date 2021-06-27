package com.seekar.dagger_hilt_concept.scope_idea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.seekar.dagger_hilt_concept.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MyActivity : AppCompatActivity() {

    /* // SCOPES
    https://developer.android.com/training/dependency-injection/hilt-android#kts

    Android class                               Generated component	            Scope
    ----------------------                      -------------------------       -------------------
    Application	                                SingletonComponent	            @Singleton
    Activity	                                ActivityRetainedComponent	    @ActivityRetainedScoped
    ViewModel	                                ViewModelComponent	            @ViewModelScoped
    Activity	                                ActivityComponent	            @ActivityScoped
    Fragment	                                FragmentComponent	            @FragmentScoped
    View	                                    ViewComponent	                @ViewScoped
    Viewannotated with @WithFragmentBindings	ViewWithFragmentComponent	    @ViewScoped
    Service	                                    ServiceComponent	            @ServiceScoped
    */

    companion object {
        const val TAG = "TAG_ScopeActivity: "
    }

    @Inject
    lateinit var scope: ActivityScopeClass


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       println(TAG + scope.doAThing())


    }

}

