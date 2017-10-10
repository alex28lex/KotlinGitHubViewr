package com.example.user.kotlingithubviewer.model.usecases

import com.example.user.kotlingithubviewer.model.dataobject.UserDetails
import com.example.user.kotlingithubviewer.model.repository.GitRepository
import io.reactivex.Observable

/**
 * Developed by Magora Team (magora-systems.com). 2017.
 *
 * @author mihaylov
 */
class LoadUserDetailsUseCase(private val gitRepository: GitRepository) {
    fun execute(login: String): Observable<UserDetails> {
        return gitRepository.getUserDetails(login)
    }
}
