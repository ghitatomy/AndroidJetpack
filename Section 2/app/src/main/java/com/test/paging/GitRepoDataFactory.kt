package com.test.paging

import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import com.test.paging.model.GitRepo

class GitRepoDataSourceFactory : DataSource.Factory<Int, GitRepo>() {

    val gitRepoLiveDataSource = MutableLiveData<GitRepoDataSource>()

    override fun create(): DataSource<Int, GitRepo> {
        val repoDataSource = GitRepoDataSource()
        gitRepoLiveDataSource.postValue(repoDataSource)
        return repoDataSource
    }
}