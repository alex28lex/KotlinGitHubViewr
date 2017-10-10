package com.example.user.kotlingithubviewer.application.retrofit

import com.example.user.kotlingithubviewer.model.dataobject.User
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET

/**
Developed by Magora Team (magora-systems.com). 2017.
 *
@author mihaylov
 */
interface GitApi {
    @GET("/users")
    fun getUsers(): Observable<List<User>>
}