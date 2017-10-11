package com.example.user.kotlingithubviewer.screen.details

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.user.kotlingithubviewer.R
import com.example.user.kotlingithubviewer.model.dataobject.UserRepos
import kotlinx.android.synthetic.main.item_repo.view.*
import java.util.ArrayList

/**
Developed by Magora Team (magora-systems.com). 2017.
 *
@author mihaylov
 */
class ReposAdapter : RecyclerView.Adapter<ReposAdapter.ReposViewHolder>() {
    private var dataList: MutableList<UserRepos> = ArrayList()

    fun setData(data: List<UserRepos>) {
        this.dataList.clear()
        this.dataList.addAll(data)
        notifyDataSetChanged()
    }


    override fun onBindViewHolder(holder: ReposViewHolder, position: Int) {
        holder.bindView(dataList[position])
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReposViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_repo, parent, false)
        return ReposViewHolder(view)
    }

    inner class ReposViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(repo: UserRepos) {
            itemView.repoNameText.text = repo.name
            itemView.repoLanguageText.text = repo.language
            itemView.repoDescriptionText.text = repo.description
            itemView.reposizeText.text = repo.size.toString()
        }
    }
}