package com.example.user.kotlingithubviewer.screen.details

import com.example.user.kotlingithubviewer.screen.base.IBasePresenter

/**
 * Developed by Magora Team (magora-systems.com). 2017.
 *
 * @author mihaylov
 */
interface IDetailsPresenter : IBasePresenter<IDetailsView> {

    fun loadUserDetail(login: String)
    fun loadUserRepos(login: String)
}
