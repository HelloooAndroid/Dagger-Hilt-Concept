package com.seekar.dagger_hilt_concept.hilt_n_mvvm

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

@InstallIn(ActivityComponent::class)
@Module
class modules {

   /* @InstallIn(SingletonComponent::class)
    @Module
    object AppProviders {
        @Provides
        @Singleton
        fun provideSomeDependency() = SomeDependency()
    }*/

    @ActivityScoped
    @Provides
    fun provideSomeDependency() = PrintingClass()




}