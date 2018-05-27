package com.example.pedrobatista.androidnavigation.presentation.common

import android.content.SharedPreferences
import android.os.Bundle
import butterknife.ButterKnife
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

abstract class BaseActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var preferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutRes)
        ButterKnife.bind(this)
    }

    protected abstract val layoutRes: Int
}
