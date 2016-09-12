package com.wada811.kotlinorma.data

import android.content.Context

object OrmaDatabaseBuilder {
    fun build(context: Context): OrmaDatabase = OrmaDatabase.builder(context).trace(true).build()
}
