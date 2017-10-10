package com.example.user.kotlingithubviewer.application

import android.app.Application
import com.example.user.kotlingithubviewer.application.retrofit.ApiFactory

/**
Developed by Magora Team (magora-systems.com). 2017.
 *
@author mihaylov
 */
class GitHubViewerApp : Application() {

    override fun onCreate() {
        super.onCreate()
        initRetrofit();
    }

    private fun initRetrofit() {
        val apiFactory = ApiFactory;
    }
}