package com.example.user.kotlingithubviewer.screen.users

import com.example.user.kotlingithubviewer.model.dataobject.User

/**
Developed by Magora Team (magora-systems.com). 2017.
 *
@author mihaylov
 */
interface IUsersView {
    fun onUsersLoad(users: List<User>)

    fun enableProgress(isEnable: Boolean)

    fun showDetailScreen(user: User)
}