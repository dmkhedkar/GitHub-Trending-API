package com.githubtrendingapi.data.local.dao


import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

import com.githubtrendingapi.data.local.entity.GithubEntity

@Dao
interface GithubDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRepositories(githubEntities: List<GithubEntity>): LongArray

//    @Query("SELECT * FROM GithubEntity")
//    fun getRepositoriesByPage(page: Long): List<GithubEntity>
}
