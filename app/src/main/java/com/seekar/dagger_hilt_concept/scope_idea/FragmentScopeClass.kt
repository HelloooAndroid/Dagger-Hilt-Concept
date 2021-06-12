package com.seekar.dagger_hilt_concept.scope_idea

import dagger.hilt.android.scopes.FragmentScoped
import javax.inject.Inject

@FragmentScoped
class FragmentScopeClass {
    @Inject
    constructor() {
    }

    fun doAThing(): String {
        return "I did a thing"
    }
}