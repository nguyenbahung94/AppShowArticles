package com.example.nbhung.appshowarticles.view

import android.content.Context
import android.util.AttributeSet
import android.widget.ScrollView
import com.example.nbhung.appshowarticles.view.listener.ScrollViewListener
import android.R.attr.y
import android.R.attr.x


class ObservableScrollView : ScrollView {
    private var isLoading = false

    private var scrollViewListener: ScrollViewListener? = null

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {}

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

    fun setScrollViewListener(scrollViewListener: ScrollViewListener) {
        this.scrollViewListener = scrollViewListener
    }

    fun startLoad() {
        isLoading = true
    }

    fun completeLoad() {
        isLoading = false
    }

    override fun onScrollChanged(x: Int, y: Int, oldx: Int, oldy: Int) {
        super.onScrollChanged(x, y, oldx, oldy)
        val diff = this.getChildAt(this.childCount - 1).bottom - (this.height + this.scrollY)
        if (scrollViewListener != null && diff == 0 && !isLoading) {
            scrollViewListener!!.onScrollEnded(this, x, y, oldx, oldy)
        }

    }


}