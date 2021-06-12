package com.seekar.dagger_hilt_concept.scope_idea

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class ActivityScopeClass {
    @Inject
    constructor() {
    }

    fun doAThing(): String {
        return "I did a thing"
    }
}