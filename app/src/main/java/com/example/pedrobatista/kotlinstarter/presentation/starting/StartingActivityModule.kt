package com.example.pedrobatista.kotlinstarter.presentation.starting

import com.example.pedrobatista.kotlinstarter.common.ActivityScope
import dagger.Binds
import dagger.Module

@Module
abstract class StartingActivityModule {

    @ActivityScope
    @Binds
    abstract fun starterPresenter(starterPresenter: StartingPresenter): StartingContract.Presenter
}