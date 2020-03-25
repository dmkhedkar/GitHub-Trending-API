package com.githubtrendingapi.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

import com.githubtrendingapi.data.local.converter.TimestampConverter
import com.githubtrendingapi.data.local.dao.GithubDao
import com.githubtrendingapi.data.local.entity.GithubEntity


@Database(entities = [GithubEntity::class], version = 1, exportSchema = false)
@TypeConverters(TimestampConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun githubDao(): GithubDao
}
