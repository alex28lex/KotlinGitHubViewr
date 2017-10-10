package com.example.user.kotlingithubviewer.model.dataobject

import com.google.gson.annotations.SerializedName

/**
Developed by Magora Team (magora-systems.com). 2017.
 *
@author mihaylov
 */
data class UserDetails(
        val login: String,
        val avatar_url: String,
        val name: String,
        val company: String,
        val location: String,
        @SerializedName("created_at")
        val createdAt: String,
        @SerializedName("public_repos")
        val publicReposCount: Int
)