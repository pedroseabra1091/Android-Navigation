package com.example.pedrobatista.androidnavigation.common.modules

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.example.pedrobatista.androidnavigation.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideApplication(app : App) : Context = app
}