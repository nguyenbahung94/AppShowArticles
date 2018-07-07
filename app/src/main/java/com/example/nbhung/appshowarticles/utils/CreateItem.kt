package com.example.nbhung.appshowarticles.utils

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.nbhung.appshowarticles.model.Articles
import org.json.JSONArray

/*
* get list Articles from file json local
* */
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
/*
* each time add 10 items from parent list to current list
* */
fun addItemToCurrentList(bigList: ArrayList<Articles>, currentList: ArrayList<Articles>, numberOfItem: Int = 10) {
    if (currentList.size < bigList.size) {
        if (currentList.size + numberOfItem <= bigList.size)
            for (i in currentList.size until currentList.size + numberOfItem) {
                currentList.add(bigList[i])
            } else {
            for (i in currentList.size until bigList.size) {
                currentList.add(bigList[i])
            }
        }
    }
}
 /*
 * check when scrolling at bottom of recyclerview
 * */
fun isTheLastItem(mRecycleView: RecyclerView): Boolean {
    val layoutManager = mRecycleView.layoutManager as LinearLayoutManager
    val pos = layoutManager.findLastCompletelyVisibleItemPosition()
    val numItems = mRecycleView.adapter.itemCount
    if (pos >= numItems - 1) {
        return true
    }
    return false
}
