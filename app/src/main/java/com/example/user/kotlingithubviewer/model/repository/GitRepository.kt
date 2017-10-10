package com.example.user.kotlingithubviewer.model.repository

import com.example.user.kotlingithubviewer.application.retrofit.ServerMethods
import com.example.user.kotlingithubviewer.model.dataobject.User
import com.example.user.kotlingithubviewer.model.dataobject.UserDetails
import io.reactivex.Observable

/**
Developed by Magora Team (magora-systems.com). 2017.
 *
@author mihaylov
 */
class GitRepository {
    fun getUsers(): Observable<List<User>> {
        return ServerMethods.Companion.getUsers()
    }

    fun getUserDetails(login: String): Observable<UserDetails> {
        return ServerMethods.Companion.getUserDetails(login)
    }
}