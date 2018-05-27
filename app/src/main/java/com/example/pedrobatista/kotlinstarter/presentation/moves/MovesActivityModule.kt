package com.example.pedrobatista.androidnavigation.presentation.moves

import com.example.pedrobatista.androidnavigation.common.ActivityScope
import dagger.Binds
import dagger.Module

@Module
abstract class MovesActivityModule {

    @ActivityScope
    @Binds
    abstract fun movesPresenter(movesPresenter: MovesPresenter): MovesContract.Presenter
}