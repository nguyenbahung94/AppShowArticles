package com.example.nbhung.appshowarticles.utils

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.nbhung.appshowarticles.R
import com.example.nbhung.appshowarticles.model.Articles
import com.example.nbhung.appshowarticles.view.ObservableScrollView
import kotlinx.android.synthetic.main.item_scrollview.view.*
import org.json.JSONArray

fun addSingleItem(context: Context, view: ViewGroup, articles: Articles) {
    val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    val item = inflater.inflate(R.layout.item_scrollview, null)
    item.tvName.text = articles.name
    item.tvContent.text = articles.content
    Glide.with(context).load(articles.urlImage).into(item.imvContent)
    Glide.with(context).load(articles.urlVideo).into(item.imvContent2)
    return view.addView(item)
}

fun getJson(context: Context): ArrayList<Articles> {
    val listItems = ArrayList<Articles>()
    val jsonString = context.assets.open("listItems.json").bufferedReader().use {
        it.readText()
    }
    val listJsonItems = JSONArray(jsonString)
    for (i in 0 until listJsonItems.length()) {
        val item = listJsonItems.getJSONObject(i)
        listItems.add(Articles(item.getString("name"), item.getString("content"), item.getString("urlImage"), item.getString("urlVideo")))
    }
    return listItems
}

fun addItemToScrollView(currentList: ArrayList<Articles>, currentItems: Int, view: ViewGroup, context: Context, scrollView: ObservableScrollView, numberOfAddItem: Int = 10) {
    for (i in currentItems until currentItems + numberOfAddItem) {
        addSingleItem(context, view, currentList[i])
    }
    scrollView.completeLoad()
}
