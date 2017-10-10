package com.example.user.kotlingithubviewer.screen.users

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log

import com.example.user.kotlingithubviewer.R

import com.example.user.kotlingithubviewer.model.dataobject.User
import com.example.user.kotlingithubviewer.screen.details.DetailActivity
import com.example.user.kotlingithubviewer.widgets.DividerItemDecoration
import io.reactivex.functions.Consumer
import kotlinx.android.synthetic.main.activity_main.*


class UsersActivity : AppCompatActivity(), IUsersView {

    private lateinit var presenter: IUsersPresenter
    private lateinit var adapter: UsersAdapter

    companion object {
        const val INTENT_KEY_USER_LOGIN = "login"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = UsersAdapter()
        presenter = UsersPresenter()
        presenter.onAttach(this)
        adapter.setClickedUserListener(Consumer { clickedUser ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_KEY_USER_LOGIN, clickedUser.login)
            startActivity(intent)
        })
        initRecycler()
        presenter.loadUsers()

    }

    private fun initRecycler() {
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST, R.drawable.recycler_divider))
        recyclerView.adapter = adapter
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

    override fun onUsersLoad(users: List<User>) {
        adapter.setData(users)
    }

    override fun showDetailScreen(user: User) {
        Log.v("showDetailScreen", "not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun enableProgress(isEnable: Boolean?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showError(error: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showError(resId: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
