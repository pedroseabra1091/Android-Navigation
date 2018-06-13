package com.example.pedrobatista.androidnavigation.presentation.moves

import com.example.pedrobatista.androidnavigation.common.ActivityScope
import dagger.Binds
import dagger.Module

@Module
abstract class StartingActivityModule {

    @ActivityScope
    @Binds
    abstract fun starterPresenter(starterPresenter: StartingPresenter): StartingContract.Presenter
}