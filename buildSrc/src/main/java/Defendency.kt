
object Defendency {

    object Versions {
        val kotlin_version = "1.3.50"
        val android_plugin_version = "3.5.0"
        val support_lib = "1.1.0"
        val core_ktx = "1.1.0"
        //        val retrofit = "2.3.0"
//        val rxjava = "2.1.9"
        val constraint_layout = "1.1.3"
        val junit = "4.12"
        val junit_runner = "1.2.0"
        val espresso_core = "3.2.0"
        val timber = "4.7.1"
        val leakcanary = "1.6.3"
    }

    object BuildPlugins {
        val android_plugin = "com.android.tools.build:gradle:${Versions.android_plugin_version}"
        val kotlin_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin_version}"
    }

    object Android {
        val applicationId = "com.share.greencloud_kotlin"
        val build_tools_version = "29.0.2"
        val compileSdk = 29
        val minSdk = 23
        val targetSdk = 29
        val versionCode = 1
        val versionName = "1.0"
    }

    object Libs {
        val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin_version}"

        val support_appcompat = "androidx.appcompat:appcompat:${Versions.support_lib}"
        val core_ktx = "androidx.core:core-ktx:${Versions.core_ktx}"
        val constraint_layout =
            "com.android.support.constraint:constraint-layout:${Versions.constraint_layout}"

        val junit = "junit:junit:${Versions.junit}"
        val junit_runner = "androidx.test:runner:${Versions.junit_runner}"
        val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso_core}"

        val timber = "com.jakewharton.timber:timber:${Versions.timber}"
        val leakcanary = "com.squareup.leakcanary:leakcanary-android:${Versions.leakcanary}"
    }

    object Maven {
        val jitpack = "https://jitpack.io"
    }
}