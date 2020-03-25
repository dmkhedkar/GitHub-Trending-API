package com.githubtrendingapi.data.remote.api

import com.githubtrendingapi.data.remote.model.GitHubApiResponse
import io.reactivex.Observable
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubApiService {

    @GET("repositories")
    fun fetchTrendingAPI(
        @Query("language") sort: String,
        @Query("since=") order: String = "daily",
        @Query("spoken_language_cod") code: String
    ): Observable<Response<GitHubApiResponse>>
}
