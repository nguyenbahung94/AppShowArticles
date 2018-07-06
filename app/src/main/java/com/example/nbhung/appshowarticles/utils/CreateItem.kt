package com.example.nbhung.appshowarticles.utils

import android.content.Context
import com.example.nbhung.appshowarticles.model.Articles
import org.json.JSONArray


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

fun addItemToCurrentList(bigList: ArrayList<Articles>, currentList: ArrayList<Articles>, numberOfItem: Int = 10) {
    if (currentList.size <= bigList.size) {
        for (i in currentList.size until currentList.size + numberOfItem) {
            currentList.add(bigList[i])
        }
    }
}
