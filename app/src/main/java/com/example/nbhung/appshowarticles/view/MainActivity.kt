package com.example.nbhung.appshowarticles.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Toast
import com.example.nbhung.appshowarticles.R
import com.example.nbhung.appshowarticles.model.Articles
import com.example.nbhung.appshowarticles.utils.addItemToCurrentList
import com.example.nbhung.appshowarticles.utils.getJson
import com.example.nbhung.appshowarticles.utils.isTheLastItem
import com.example.nbhung.appshowarticles.view.adapter.ArticlesAdapter
import com.example.nbhung.appshowarticles.view.listener.MyOnclickListener
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity(), MyOnclickListener {
    override fun onclickItem(v: View, position: Int) {
        Toast.makeText(this@MainActivity, "position = $position", Toast.LENGTH_SHORT).show()
    }

    private lateinit var listArticles: ArrayList<Articles>
    private val currentListArticles = ArrayList<Articles>()
    private var adapterArticle: ArticlesAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupRecycleView()
    }

    private fun setupRecycleView() {
        listArticles = getJson(this@MainActivity)
        mRecycleView.layoutManager = LinearLayoutManager(this)
        mRecycleView.setHasFixedSize(true)
        adapterArticle = ArticlesAdapter(currentListArticles, this@MainActivity)
        adapterArticle!!.setMyclick(this)
        mRecycleView.adapter = adapterArticle
        addTenItems()
        mRecycleView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView?, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                if (isTheLastItem(mRecycleView))
                    addTenItems()

            }
        })
    }

    private fun addTenItems() {
        addItemToCurrentList(listArticles, currentListArticles)
        adapterArticle!!.notifyDataSetChanged()
    }
}
