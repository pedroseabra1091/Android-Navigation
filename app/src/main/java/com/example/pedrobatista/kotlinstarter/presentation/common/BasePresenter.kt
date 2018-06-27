package com.example.pedrobatista.kotlinstarter.presentation.common

import com.example.pedrobatista.kotlinstarter.presentation.common.BaseView

interface BasePresenter<V : BaseView> {
    fun attachView(view : V)

    fun detachView()

    fun isViewAttached() : Boolean

    fun resume()

    fun pause()

    fun destroy()
}