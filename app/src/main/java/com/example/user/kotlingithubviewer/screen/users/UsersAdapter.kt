package com.example.user.kotlingithubviewer.screen.users

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.user.kotlingithubviewer.R
import com.example.user.kotlingithubviewer.model.dataobject.User
import io.reactivex.functions.Consumer
import java.util.ArrayList
import kotlinx.android.synthetic.main.item_git_user.view.*

/**
Developed by Magora Team (magora-systems.com). 2017.
 *
@author mihaylov
 */
class UsersAdapter : RecyclerView.Adapter<UsersAdapter.UserViewHolder>() {
    private var dataList: MutableList<User> = ArrayList()
    private lateinit var clickedUserConsumer: Consumer<User>


    fun setClickedUserListener(listener: Consumer<User>) {
        clickedUserConsumer = listener
    }

    fun setData(data: List<User>) {
        this.dataList.clear()
        this.dataList.addAll(data)
        notifyDataSetChanged()
    }


    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bindView(dataList[position])
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_git_user, parent, false)
        return UserViewHolder(view)
    }

    inner class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(user: User) {
            itemView.userNameText.text = user.login
            Glide.with(itemView.context)
                    .load(user.avatar_url)
                    .error(R.mipmap.ic_launcher)
                    .dontAnimate()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(itemView.userPhotoImage)
            itemView.setOnClickListener { clickedUserConsumer.accept(dataList[adapterPosition]) }
        }
    }
}