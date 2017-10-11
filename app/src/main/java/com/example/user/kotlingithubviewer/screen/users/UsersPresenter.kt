package com.example.user.kotlingithubviewer.screen.users

import com.example.user.kotlingithubviewer.model.dataobject.User
import com.example.user.kotlingithubviewer.model.repository.GitRepository
import com.example.user.kotlingithubviewer.model.usecases.LoadUsersUseCase
import com.example.user.kotlingithubviewer.screen.base.BasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
Developed by Magora Team (magora-systems.com). 2017.
 *
@author mihaylov
 */
class UsersPresenter : BasePresenter<IUsersView>(), IUsersPresenter {

    private var loadUsersUseCase: LoadUsersUseCase = LoadUsersUseCase(GitRepository())

    override fun loadUsers() {
        loadUsersUseCase.execute()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ n ->  getMyView().onUsersLoad(n) }, { e -> e.printStackTrace() }, { })
    }

    override fun onUserClicked(user: User) {
        getMyView().showDetailScreen(user)
    }


}