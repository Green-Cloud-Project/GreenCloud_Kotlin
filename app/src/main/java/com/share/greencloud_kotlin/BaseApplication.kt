package com.share.greencloud_kotlin

import android.app.Application
import com.squareup.leakcanary.LeakCanary
import timber.log.Timber

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this

        Timber.plant(Timber.DebugTree())

        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return
        }
        LeakCanary.install(this)
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