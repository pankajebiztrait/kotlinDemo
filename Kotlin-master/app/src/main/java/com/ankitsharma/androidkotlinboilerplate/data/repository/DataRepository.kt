package com.ankitsharma.androidkotlinboilerplate.data.repository

import com.ankitsharma.androidkotlinboilerplate.data.models.RepoSearchResponse
import com.ankitsharma.androidkotlinboilerplate.data.services.GithubService
import com.ankitsharma.androidkotlinboilerplate.di.annotations.ApplicationScope
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import javax.inject.Inject

/**
 *
 */
@ApplicationScope
class DataRepository @Inject constructor(private val githubService: GithubService) {

    fun getMessage(): String {
        return "hello my message"
    }

    fun searchRepositories(query: String,
                           page:Int=0,
                           per_page:Int=20): Observable<RepoSearchResponse> = githubService.searchRepos(query,page,per_page)

}