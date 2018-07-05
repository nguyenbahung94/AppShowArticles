package com.example.nbhung.appshowarticles.utils

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.nbhung.appshowarticles.R
import com.example.nbhung.appshowarticles.model.Articles
import kotlinx.android.synthetic.main.item_scrollview.view.*

fun addItems(context: Context, view: ViewGroup, articles: Articles) {
    val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    val item = inflater.inflate(R.layout.item_scrollview, null)
    item.tvName.text = articles.name
    item.tvContent.text = articles.content
    Glide.with(context).load(articles.urlImage).into(item.imvContent)
    Glide.with(context).load(articles.urlVideo).into(item.imvContent2)
    return view.addView(item)
}