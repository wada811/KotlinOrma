package com.wada811.kotlinorma

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen
import com.wada811.kotlinorma.data.OrmaDatabaseBuilder

class KotlinOrmaApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        AndroidThreeTen.init(this)
        val database = OrmaDatabaseBuilder.build(this)
    }
}