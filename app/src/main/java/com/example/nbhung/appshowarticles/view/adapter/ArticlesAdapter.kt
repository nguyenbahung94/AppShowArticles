package com.example.nbhung.appshowarticles.view.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.nbhung.appshowarticles.R
import com.example.nbhung.appshowarticles.model.Articles
import kotlinx.android.synthetic.main.item_scrollview.view.*

class ArticlesAdapter(private val listArticle: ArrayList<Articles>, private val context: Context) : RecyclerView.Adapter<ArticlesAdapter.ArticlesHolder>() {
    override fun getItemCount(): Int = listArticle.size

    override fun onBindViewHolder(holder: ArticlesHolder, position: Int) {
        val currentArticle = listArticle[position]
        holder.tvName.text = currentArticle.name
        holder.tvContent.text = currentArticle.content
        Glide.with(context).load(currentArticle.urlImage).into(holder.imageView)
        Glide.with(context).load(currentArticle.urlImage).into(holder.imageViewVideo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticlesHolder {
        return ArticlesHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_scrollview, parent, false))
    }

    class ArticlesHolder(v: View) : RecyclerView.ViewHolder(v) {
        val tvName = v.tvName!!
        val tvContent = v.tvContent!!
        val imageView = v.imvContent!!
        val imageViewVideo = v.imvContent2!!
    }
}