package com.example.user.kotlingithubviewer.screen.users

import com.example.user.kotlingithubviewer.model.dataobject.User

/**
Developed by Magora Team (magora-systems.com). 2017.
 *
@author mihaylov
 */
interface IUsersPresenter {
    fun loadUsers()

    fun onUserClicked(user: User)

    fun onAttach(view: IUsersView)

    fun onDetach()
}