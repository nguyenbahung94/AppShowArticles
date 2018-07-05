package com.example.nbhung.appshowarticles.view.listener

import com.example.nbhung.appshowarticles.view.ObservableScrollView




interface ScrollViewListener {
    fun onScrollEnded(scrollView: ObservableScrollView, x: Int, y: Int, oldx: Int, oldy: Int)

}