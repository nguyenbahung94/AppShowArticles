package com.example.nbhung.appshowarticles.view

import android.database.DatabaseUtils
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.nbhung.appshowarticles.R
import com.example.nbhung.appshowarticles.model.Articles
import com.example.nbhung.appshowarticles.utils.addItemToCurrentList
import com.example.nbhung.appshowarticles.utils.getJson
import com.example.nbhung.appshowarticles.view.adapter.ArticlesAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var listArticles: ArrayList<Articles>
    private val currentListArticles = ArrayList<Articles>()
    private var adapterArticle: ArticlesAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listArticles = getJson(this@MainActivity)
        setupRecycleView()
    }

    private fun setupRecycleView() {
        mRecycleView.layoutManager = LinearLayoutManager(this)
        mRecycleView.setHasFixedSize(true)
        mRecycleView.setItemViewCacheSize(10000)
        adapterArticle = ArticlesAdapter(currentListArticles, this@MainActivity)
        mRecycleView.adapter = adapterArticle
        addItemToCurrentList(listArticles, currentListArticles)
        adapterArticle!!.notifyDataSetChanged()
    }
}
