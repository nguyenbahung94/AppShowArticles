package com.example.nbhung.appshowarticles.view

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.nbhung.appshowarticles.R
import com.example.nbhung.appshowarticles.model.Articles
import com.example.nbhung.appshowarticles.utils.addItemToScrollView
import com.example.nbhung.appshowarticles.utils.getJson
import com.example.nbhung.appshowarticles.view.listener.ScrollViewListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ScrollViewListener {

    private lateinit var listArticles: ArrayList<Articles>
    private var currentItems = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mScrollView.setScrollViewListener(this)
        listArticles = getJson(this@MainActivity)
        addArticles()
    }

    private fun addArticles() {
        Log.e("MainActivity", "add item to list")
        addItemToScrollView(listArticles, currentItems, mLL, this@MainActivity,mScrollView)
    }

    override fun onScrollEnded(scrollView: ObservableScrollView, x: Int, y: Int, oldx: Int, oldy: Int) {
        addArticles()
    }
}
