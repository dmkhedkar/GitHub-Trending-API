package com.githubtrendingapi.di.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.githubtrendingapi.factory.ViewModelFactory
import com.githubtrendingapi.factory.ViewModelKey
import com.githubtrendingapi.ui.viewmodules.GithubViewModel

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(GithubViewModel::class)
    protected abstract fun githubListViewModel(githubViewModel: GithubViewModel): ViewModel
}