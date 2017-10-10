package com.example.user.kotlingithubviewer.screen.users

import com.example.user.kotlingithubviewer.model.dataobject.User
import com.example.user.kotlingithubviewer.screen.base.IBasePresenter

/**
Developed by Magora Team (magora-systems.com). 2017.
 *
@author mihaylov
 */
interface IUsersPresenter : IBasePresenter<IUsersView> {
    fun loadUsers()

    fun onUserClicked(user: User)
}