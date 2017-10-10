package com.example.user.kotlingithubviewer.screen.users

import com.example.user.kotlingithubviewer.model.dataobject.User
import com.example.user.kotlingithubviewer.model.repository.GitRepository
import com.example.user.kotlingithubviewer.model.usecases.LoadUsersUseCase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
Developed by Magora Team (magora-systems.com). 2017.
 *
@author mihaylov
 */
class UsersPresenter : IUsersPresenter {
    private lateinit var view: IUsersView
    private var loadUsersUseCase: LoadUsersUseCase = LoadUsersUseCase(GitRepository())

    override fun onAttach(view: IUsersView) {
        this.view = view
    }

    override fun onDetach() {

    }

    override fun loadUsers() {
        loadUsersUseCase.execute()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ n -> view.onUsersLoad(n) }, { e -> e.printStackTrace() }, { })
    }

    override fun onUserClicked(user: User) {
        view.showDetailScreen(user)
    }


}