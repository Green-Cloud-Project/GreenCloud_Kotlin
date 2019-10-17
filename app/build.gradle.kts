plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {
    compileSdkVersion(Defendency.Android.compileSdk)
    buildToolsVersion(Defendency.Android.build_tools_version)

    defaultConfig {
        minSdkVersion(Defendency.Android.minSdk)
        targetSdkVersion(Defendency.Android.targetSdk)

        applicationId = Defendency.Android.applicationId
        versionCode = Defendency.Android.versionCode
        versionName = Defendency.Android.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles("proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(Defendency.Libs.kotlin_stdlib)
    implementation(Defendency.Libs.support_appcompat)
    implementation(Defendency.Libs.core_ktx)
    implementation(Defendency.Libs.constraint_layout)

    testImplementation(Defendency.Libs.junit)
    androidTestImplementation(Defendency.Libs.junit_runner)
    androidTestImplementation(Defendency.Libs.espresso_core)

    implementation(Defendency.Libs.timber)
    implementation(Defendency.Libs.leakcanary)
    testImplementation(Defendency.Libs.leakcanary)
    releaseImplementation(Defendency.Libs.leakcanary)
}

//apply plugin: 'com.android.application'
//
//apply plugin: 'kotlin-android'
//
//apply plugin: 'kotlin-android-extensions'

//android {
//    compileSdkVersion (Defendency.Android.compileSdk)
//    buildToolsVersion (Defendency.Android.build_tools_version)
//      applicationId = Defendency.Android.applicationId
//        minSdkVersion 23
//        targetSdkVersion 29
//        versionCode 1
//        versionName "1.0"
//        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
//    }
//    buildTypes {
//        release {
//            minifyEnabled false
//            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
//        }
//    }
//}
//
//dependencies {
//    implementation fileTree(org.gradle.internal.impldep.bsh.commands.dir: 'libs', include: ['*.jar'])
//    implementation "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlin_version"
//    implementation 'androidx.appcompat:appcompat:1.1.0'
//    implementation 'androidx.core:core-ktx:1.1.0'
//    implementation 'androidx.constraintlayout:constraintlayout:1.1.3'
//    testImplementation 'junit:junit:4.12'
//    androidTestImplementation 'androidx.test:runner:1.2.0'
//    androidTestImplementation 'androidx.test.espresso:espresso-core:3.2.0'
//
//    // 로그 출력
//    implementation 'com.jakewharton.timber:timber:4.7.1'
//
//    // 메모리릭 검출 라이브러리
//    debugImplementation 'com.squareup.leakcanary:leakcanary-android:1.6.3'
//    releaseImplementation 'com.squareup.leakcanary:leakcanary-android:1.6.3'
//    testImplementation 'com.squareup.leakcanary:leakcanary-android:1.6.3'
//}
