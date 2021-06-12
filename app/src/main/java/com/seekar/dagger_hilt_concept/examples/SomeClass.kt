package com.seekar.dagger_hilt_concept.examples

import javax.inject.Inject

class SomeClass {
    @Inject
    constructor() {
    }

    fun doAThing(): String {
        return "I did a thing"
    }
}