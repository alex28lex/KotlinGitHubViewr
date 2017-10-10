package com.example.user.kotlingithubviewer.application.retrofit

import com.example.user.kotlingithubviewer.model.dataobject.User
import io.reactivex.Observable

/**
Developed by Magora Team (magora-systems.com). 2017.
 *
@author mihaylov
 */
class ServerMethods {
    companion object {
        fun getUsers(): Observable<List<User>> {
            return ApiFactory.api.getUsers();
        }
    }
}