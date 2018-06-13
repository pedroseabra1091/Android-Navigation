package com.example.pedrobatista.androidnavigation.common.modules

import com.example.pedrobatista.androidnavigation.presentation.moves.StartingActivity
import com.example.pedrobatista.androidnavigation.presentation.moves.StartingActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivitiesBindingModule {
    @ContributesAndroidInjector(modules = [StartingActivityModule::class])
    abstract fun startingActivity():StartingActivity
}
