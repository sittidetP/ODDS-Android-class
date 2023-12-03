package com.example.pokemon

import android.util.Log
import javax.inject.Inject


class CommonLog @Inject constructor() { // concrete class not require to @Provide how to create it
    fun logCommon() {
        Log.e(CommonLog::class.simpleName, "COMMON")
    }
}