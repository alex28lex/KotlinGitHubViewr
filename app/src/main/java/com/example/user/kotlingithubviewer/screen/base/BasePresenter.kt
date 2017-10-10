package com.example.user.kotlingithubviewer.screen.base

/**
Developed by Magora Team (magora-systems.com). 2017.
 *
@author mihaylov
 */
open class BasePresenter<in V : IBaseView> : IBasePresenter<V> {
    protected var view: IBaseView? = null
    override fun onAttach(view: V) {
        this.view = view
    }

    override fun onDetach() {
        this.view = null
    }
}