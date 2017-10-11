package com.example.user.kotlingithubviewer.screen.base

/**
 * Developed by Magora Team (magora-systems.com). 2017.
 *
 * @author mihaylov
 */
interface IBasePresenter<V : IBaseView> {

    fun onAttach(view: V)

    fun onDetach()

    fun getMyView():V
}
