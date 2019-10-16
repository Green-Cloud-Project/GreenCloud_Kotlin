package com.share.greencloud_kotlin

interface SpashView {

    fun showProgress()

    fun hideProgress()

    fun onError(throwable: Throwable)
}