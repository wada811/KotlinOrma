package com.wada811.kotlinorma

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen
import com.wada811.kotlinorma.data.OrmaDatabase

class KotlinOrmaApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        AndroidThreeTen.init(this)
        val database = OrmaDatabase.builder(this).trace(true).build()
    }
}