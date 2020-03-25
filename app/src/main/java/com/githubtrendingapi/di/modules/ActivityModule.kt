package com.githubtrendingapi.di.modules

import com.githubtrendingapi.ui.activities.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    @ActivityScope
    @ContributesAndroidInjector
    abstract fun contributeGithubActivity(): MainActivity
}