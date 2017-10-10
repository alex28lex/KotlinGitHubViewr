package com.example.user.kotlingithubviewer.model.usecases


import com.example.user.kotlingithubviewer.model.dataobject.User
import com.example.user.kotlingithubviewer.model.repository.GitRepository

import io.reactivex.Observable

/**
 * Developed by Magora Team (magora-systems.com). 2017.
 *
 * @author mihaylov
 */
class LoadUsersUseCase(private val gitRepository: GitRepository) {
    fun execute(): Observable<List<User>> {
        return gitRepository.getUsers()
    }
}
