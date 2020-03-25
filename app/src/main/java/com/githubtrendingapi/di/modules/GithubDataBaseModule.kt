package com.githubtrendingapi.di.modules

import android.app.Application
import androidx.room.Room
import com.githubtrendingapi.data.local.AppDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class GithubDataBaseModule {

    @Provides
    @Singleton
    internal fun provideDatabase(application: Application) =
        Room.databaseBuilder(
            application,
            AppDatabase::class.java, "Github.db"
        ).build()

    @Provides
    @Singleton
    internal fun provideGithubDao(appDatabase: AppDatabase) = appDatabase.githubDao()
}