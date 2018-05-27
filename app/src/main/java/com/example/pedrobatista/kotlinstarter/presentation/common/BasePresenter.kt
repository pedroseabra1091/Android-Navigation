package com.example.pedrobatista.androidnavigation.presentation.common

interface BasePresenter<V : BaseView> {
    fun attachView(view : V)

    fun detachView()

    fun isViewAttached() : Boolean

    fun resume()

    fun pause()

    fun destroy()
}