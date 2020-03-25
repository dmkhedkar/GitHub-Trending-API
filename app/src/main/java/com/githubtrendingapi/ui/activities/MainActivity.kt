package com.githubtrendingapi.ui.activities

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.githubtrendingapi.R
import com.githubtrendingapi.factory.ViewModelFactory
import com.githubtrendingapi.ui.viewmodules.GithubViewModel
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val githubViewModel by viewModels<GithubViewModel> {
        viewModelFactory
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        githubViewModel.fetchRepos()
    }
}
