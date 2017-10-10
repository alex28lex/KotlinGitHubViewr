package com.example.user.kotlingithubviewer.screen.details

import com.example.user.kotlingithubviewer.model.repository.GitRepository
import com.example.user.kotlingithubviewer.model.usecases.LoadUserDetailsUseCase
import com.example.user.kotlingithubviewer.screen.base.BasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
Developed by Magora Team (magora-systems.com). 2017.
 *
@author mihaylov
 */
class DetailsPresenter : BasePresenter<IDetailsView>(), IDetailsPresenter {

    private var loadUserDetailsUseCase: LoadUserDetailsUseCase = LoadUserDetailsUseCase(GitRepository())

    override fun loadUserDetail(login:String) {
        loadUserDetailsUseCase.execute(login)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ n -> (view as IDetailsView).showDetails(n) }, { e -> e.printStackTrace() }, { })
    }

}