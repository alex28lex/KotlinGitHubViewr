package com.example.user.kotlingithubviewer.screen.users

import com.example.user.kotlingithubviewer.model.dataobject.User
import com.example.user.kotlingithubviewer.screen.base.IBaseView

/**
Developed by Magora Team (magora-systems.com). 2017.
 *
@author mihaylov
 */
interface IUsersView : IBaseView {
    fun onUsersLoad(users: List<User>)

    fun showDetailScreen(user: User)
}