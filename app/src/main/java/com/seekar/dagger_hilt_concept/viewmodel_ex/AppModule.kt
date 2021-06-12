package com.seekar.dagger_hilt_concept.viewmodel_ex

import android.app.Application
import com.seekar.dagger_hilt_concept.interface_thirdparty_binding_issue_resolved.IPrint
import com.seekar.dagger_hilt_concept.interface_thirdparty_binding_issue_resolved.PrintData
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

@Module
@InstallIn(ActivityComponent::class)
object AppModule {

    @ActivityScoped
    @Provides
    fun provideString(): String {
        return  "Pratim"
    }
}