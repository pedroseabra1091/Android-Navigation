package com.example.pedrobatista.kotlinstarter.common.components

import android.app.Application
import com.example.pedrobatista.kotlinstarter.App
import com.example.pedrobatista.kotlinstarter.common.modules.ActivitiesBindingModule
import com.example.pedrobatista.kotlinstarter.common.modules.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
        modules = [
            AndroidSupportInjectionModule::class,
            AppModule::class,
            ActivitiesBindingModule::class
        ]
)
interface AppComponent: AndroidInjector<App> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun create(app: Application): Builder

        fun build(): AppComponent
    }
}