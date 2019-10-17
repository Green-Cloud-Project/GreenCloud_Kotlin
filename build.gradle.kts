// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        jcenter()

    }
    dependencies {
        classpath(Defendency.BuildPlugins.android_plugin)
        classpath(Defendency.BuildPlugins.kotlin_plugin)
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven(Defendency.Maven.jitpack)
    }
}

task("clean") {
    delete(rootProject.buildDir)
}
