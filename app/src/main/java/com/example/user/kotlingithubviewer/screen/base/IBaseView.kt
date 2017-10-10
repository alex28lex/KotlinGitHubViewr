package com.example.user.kotlingithubviewer.screen.base

/**
 * Developed by Magora Team (magora-systems.com). 2017.
 *
 * @author mihaylov
 */
interface IBaseView {

    fun enableProgress(isEnable: Boolean?)

    fun showError(error: String)

    fun showError(resId: Int)
}
