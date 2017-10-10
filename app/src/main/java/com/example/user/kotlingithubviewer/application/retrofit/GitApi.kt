package com.example.user.kotlingithubviewer.application.retrofit

import com.example.user.kotlingithubviewer.model.dataobject.User
import com.example.user.kotlingithubviewer.model.dataobject.UserDetails
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
Developed by Magora Team (magora-systems.com). 2017.
 *
@author mihaylov
 */
interface GitApi {
    @GET("/users")
    fun getUsers(): Observable<List<User>>

    @GET("/users/{login}")
    fun getUserDetails(@Path("login") login: String): Observable<UserDetails>
}