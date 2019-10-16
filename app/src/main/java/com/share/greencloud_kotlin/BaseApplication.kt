package com.share.greencloud_kotlin

import android.app.Application
import timber.log.Timber

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this

        Timber.plant(Timber.DebugTree())
    }

    companion object {
        private lateinit var instance: BaseApplication

        val globalApplicationContext: BaseApplication
            get() {
                checkNotNull(instance) { "This Application does not inherit com.kakao.BaseApplication" }

                return instance
            }
    }
}