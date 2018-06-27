package com.example.pedrobatista.kotlinstarter.common.modules

import com.example.pedrobatista.kotlinstarter.presentation.starting.StartingActivity
import com.example.pedrobatista.kotlinstarter.presentation.starting.StartingActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivitiesBindingModule {
    @ContributesAndroidInjector(modules = [StartingActivityModule::class])
    abstract fun startingActivity(): StartingActivity
}
