package com.githubtrendingapi.di.components

import android.app.Application
import com.githubtrendingapi.GithubApiApplication
import com.githubtrendingapi.di.modules.ActivityModule
import com.githubtrendingapi.di.modules.ApiModule
import com.githubtrendingapi.di.modules.GithubDataBaseModule
import com.githubtrendingapi.di.modules.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        ApiModule::class,
        GithubDataBaseModule::class,
        ViewModelModule::class,
        ActivityModule::class]
)

interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }

    fun inject(application: GithubApiApplication)
}