package com.share.greencloud_kotlin

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_splash.*
import timber.log.Timber

class SplashActivity : AppCompatActivity(R.layout.activity_splash), SpashView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        scheduleSplashScreen()
    }

    private fun scheduleSplashScreen() {
        val splashScreenDuration = getSplashScreenDuration()
        Handler().postDelayed(
            {
                routeToAppropriatePage()
            },
            splashScreenDuration
        )
    }

    private fun routeToAppropriatePage() {
        val spashViewModel = SpashViewModel(this, this)
        var result = spashViewModel.checkNetwork()
        Timber.d("check result: $result")
        when (result) {
            is NetworkState.Success -> this.launchActivity<OnboardingActivity>()
            is NetworkState.Error -> this.finish()
        }
    }

    // 유저에 따라서 SplashScreen 실행시간을 구분해줌
    private fun getSplashScreenDuration(): Long {
        val sp = getPreferences(Context.MODE_PRIVATE)
        val prefKeyFirstLaunch = "pref_first_launch"

        return when (sp.getBoolean(prefKeyFirstLaunch, true)) {
            true -> {
                // 처음 앱을 실행한 유저일 경우
                sp.edit().putBoolean(prefKeyFirstLaunch, false).apply()
                3000
            }
            false -> {
                // 기존에 실행한 적이 있는 유저일 경우
                1000
            }
        }
    }

    override fun showProgress() {
        progressBar.visibility = View.VISIBLE
    }

    override fun hideProgress() {
        progressBar.visibility = View.INVISIBLE
    }

    override fun onError(throwable: Throwable) {
        Toast.makeText(this, "네트워크가 연결되지 않았습니다. $throwable", Toast.LENGTH_SHORT).show()
    }

    // kotlin extension 함수로 정의한, 액티비티 전환하는 함수
    inline fun <reified T : Activity> Activity.launchActivity() {
        val intent = Intent(this, T::class.java)
        startActivity(intent)
    }
}
