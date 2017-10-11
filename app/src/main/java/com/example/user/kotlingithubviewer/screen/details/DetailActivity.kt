package com.example.user.kotlingithubviewer.screen.details

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy

import com.example.user.kotlingithubviewer.R
import com.example.user.kotlingithubviewer.model.dataobject.UserDetails
import com.example.user.kotlingithubviewer.model.dataobject.UserRepos
import com.example.user.kotlingithubviewer.screen.users.UsersActivity
import com.example.user.kotlingithubviewer.widgets.DividerItemDecoration
import kotlinx.android.synthetic.main.activity_detail.*


class DetailActivity : AppCompatActivity(), IDetailsView {

    private lateinit var presenter: IDetailsPresenter
    private lateinit var adapter: ReposAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        adapter = ReposAdapter()
        initRecycler()
        presenter = DetailsPresenter()
        presenter.onAttach(this)
        presenter.loadUserDetail(intent.getStringExtra(UsersActivity.INTENT_KEY_USER_LOGIN))
        presenter.loadUserRepos(intent.getStringExtra(UsersActivity.INTENT_KEY_USER_LOGIN))

    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

    private fun initRecycler() {
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST, R.drawable.recycler_divider))
        recyclerView.adapter = adapter
    }

    override fun enableProgress(isEnable: Boolean) {
        progress.visibility = if (isEnable) View.VISIBLE else View.GONE
    }

    override fun showError(error: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showError(resId: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showDetails(details: UserDetails) {
        loginText.text = details.login
        openReposCount.text = details.publicReposCount.toString()
        Glide.with(this)
                .load(details.avatar_url)
                .error(R.mipmap.ic_launcher)
                .dontAnimate()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(avatarImage)
    }

    override fun showRepos(repos: List<UserRepos>) {
        adapter.setData(repos)
    }
}
