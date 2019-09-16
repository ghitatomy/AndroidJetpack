package com.test.paging

import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.test.paging.model.GitRepo

class GitRepoViewModel : ViewModel() {
    var gitRepoPagedList: LiveData<PagedList<GitRepo>>
    private var liveDataSource: LiveData<GitRepoDataSource>

    init {
        val itemDataSourceFactory = GitRepoDataSourceFactory()
        liveDataSource = itemDataSourceFactory.gitRepoLiveDataSource

        val config = PagedList.Config.Builder()
            .setEnablePlaceholders(false)
            .setPageSize(GitRepoDataSource.PAGE_SIZE)
            .build()

        gitRepoPagedList = LivePagedListBuilder(itemDataSourceFactory, config)
            .build()
    }
}