package com.githubtrendingapi.ui.viewmodules

import androidx.lifecycle.ViewModel
import com.githubtrendingapi.data.GithubRepository
import com.githubtrendingapi.data.local.dao.GithubDao
import com.githubtrendingapi.data.remote.api.GithubApiService
import javax.inject.Inject

class GithubViewModel @Inject
constructor(githubDao: GithubDao, githubApiService: GithubApiService) : ViewModel() {

    var repository = GithubRepository(githubDao, githubApiService)

    fun fetchRepos() {
        repository.fetchRepos()
    }
}