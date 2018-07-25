package com.example.test.notestswerefound

import android.app.Application

class SampleApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        throw RuntimeException("Where is stacktrace?")
    }
}