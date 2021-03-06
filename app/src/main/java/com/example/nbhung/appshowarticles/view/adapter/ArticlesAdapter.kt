package com.example.nbhung.appshowarticles.view.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.example.nbhung.appshowarticles.R
import com.example.nbhung.appshowarticles.model.Articles
import com.example.nbhung.appshowarticles.view.listener.MyOnclickListener
import kotlinx.android.synthetic.main.item_scrollview.view.*
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions


class ArticlesAdapter(private val listArticle: ArrayList<Articles>, private val context: Context) : RecyclerView.Adapter<ArticlesAdapter.ArticlesHolder>() {
    private var mClick: MyOnclickListener? = null
    fun setMyclick(mClick: MyOnclickListener) {
        this@ArticlesAdapter.mClick = mClick
    }

    override fun getItemCount(): Int = listArticle.size

    override fun onBindViewHolder(holder: ArticlesHolder, position: Int) {
        val currentArticle = listArticle[position]
        holder.tvName.text = currentArticle.name
        holder.tvContent.text = currentArticle.content
        val options = RequestOptions()
                .placeholder(R.drawable.image_loading)
                .error(R.drawable.image_error)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .priority(Priority.NORMAL)
        Glide.with(context).load(currentArticle.urlImage).apply(options).into(holder.imageView)
        Glide.with(context).load(currentArticle.urlImage).apply(options).into(holder.imageViewVideo)
        holder.mLL.setOnClickListener { v -> mClick!!.onclickItem(v, position) }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticlesHolder {
        return ArticlesHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_scrollview, parent, false))
    }

    companion object
    class ArticlesHolder(v: View) : RecyclerView.ViewHolder(v) {
        val tvName = v.tvName!!
        val tvContent = v.tvContent!!
        val imageView = v.imvContent!!
        val imageViewVideo = v.imvContent2!!
        val mLL = v.mLL!!
    }
}