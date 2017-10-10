package com.example.user.kotlingithubviewer.screen.details

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.example.user.kotlingithubviewer.R

class DetailActivity : AppCompatActivity(), IDetailsView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
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

    override fun showDetails() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
