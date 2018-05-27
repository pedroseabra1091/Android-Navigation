package com.example.pedrobatista.androidnavigation.common.modules

import com.example.pedrobatista.androidnavigation.presentation.moves.MovesActivity
import com.example.pedrobatista.androidnavigation.presentation.moves.MovesActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivitiesBindingModule {
    @ContributesAndroidInjector(modules = [MovesActivityModule::class])
    abstract fun movesActivity():MovesActivity
}
