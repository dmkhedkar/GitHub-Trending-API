package com.githubtrendingapi.data


import com.githubtrendingapi.data.local.dao.GithubDao
import com.githubtrendingapi.data.remote.api.GithubApiService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Singleton

@Singleton
class GithubRepository(
    private val githubDao: GithubDao,
    private val githubApiService: GithubApiService
) {

    fun fetchRepos() {
        githubApiService.fetchTrendingAPI("", "daily", "")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                println(it.body())
            }, { it.printStackTrace() })
    }
}