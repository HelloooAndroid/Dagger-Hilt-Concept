package com.seekar.dagger_hilt_concept.interface_thirdparty_binding_issue_resolved

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
public class MyModule{
    @Singleton
    @Provides
    fun providePrintInterfaceImpl():IPrint{
        return  PrintData()
    }


    //For third party class
   /* @InstallIn(ActivityComponent::class)
    @Module
    object AppProviders {
        @ActivityScoped
        @Provides
        fun provideGsonImpl(): Gson {
            return Gson()
        }
    }*/

    @Singleton
    @Provides
    fun provideGsonImpl(): Gson {
        return  Gson()
    }

}