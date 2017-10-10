package com.example.user.kotlingithubviewer.screen.users

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log

import com.example.user.kotlingithubviewer.R

import com.example.user.kotlingithubviewer.model.dataobject.User
import io.reactivex.functions.Consumer
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), IUsersView {

    private lateinit var presenter: IUsersPresenter
    private lateinit var adapter: UsersAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = UsersAdapter()
        presenter = UsersPresenter()
        presenter.onAttach(this)
        adapter.setClickedUserListener(Consumer { })
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = adapter
        presenter.loadUsers()

    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

    override fun onUsersLoad(users: List<User>) {
        adapter.setData(users)
    }

    override fun enableProgress(isEnable: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showDetailScreen(user: User) {
        Log.v("showDetailScreen", "not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
