package com.example.nbhung.appshowarticles.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.nbhung.appshowarticles.R
import com.example.nbhung.appshowarticles.model.Articles
import com.example.nbhung.appshowarticles.utils.addItems
import com.example.nbhung.appshowarticles.view.listener.ScrollViewListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ScrollViewListener {
    override fun onScrollEnded(scrollView: ObservableScrollView, x: Int, y: Int, oldx: Int, oldy: Int) {
        mScrollView.startLoad()
        if (y > threshold) createDataForListArticles()
    }

    private var listArticles = ArrayList<Articles>()
    var threshold = 0
    var oldSize = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createDataForListArticles()
        addItem()
        mScrollView.setScrollViewListener(this)

    }

    private fun addItem() {
        for (i in oldSize until listArticles.size) {
            addItems(this, mLL, listArticles[i])
        }
        oldSize = listArticles.size
        mScrollView.completeLoad()
    }

    private fun createDataForListArticles() {

        threshold += 10
        listArticles.add(Articles("Mr.T", "Ngày hôm nay tháng này năm 2018", "https://camo.mybb.com/e01de90be6012adc1b1701dba899491a9348ae79/687474703a2f2f7777772e6a71756572797363726970742e6e65742f696d616765732f53696d706c6573742d526573706f6e736976652d6a51756572792d496d6167652d4c69676874626f782d506c7567696e2d73696d706c652d6c69676874626f782e6a7067", "https://static.wixstatic.com/media/65c017_714476b99e2f42929c4a8fd13725d5ce.png/v1/fill/w_445,h_445,al_c/65c017_714476b99e2f42929c4a8fd13725d5ce.png"))
        listArticles.add(Articles("Mr.T", "Ngày hôm nay tháng này năm 2018", "https://camo.mybb.com/e01de90be6012adc1b1701dba899491a9348ae79/687474703a2f2f7777772e6a71756572797363726970742e6e65742f696d616765732f53696d706c6573742d526573706f6e736976652d6a51756572792d496d6167652d4c69676874626f782d506c7567696e2d73696d706c652d6c69676874626f782e6a7067", "https://static.wixstatic.com/media/65c017_714476b99e2f42929c4a8fd13725d5ce.png/v1/fill/w_445,h_445,al_c/65c017_714476b99e2f42929c4a8fd13725d5ce.png"))
        listArticles.add(Articles("Mr.T", "Ngày hôm nay tháng này năm 2018", "https://camo.mybb.com/e01de90be6012adc1b1701dba899491a9348ae79/687474703a2f2f7777772e6a71756572797363726970742e6e65742f696d616765732f53696d706c6573742d526573706f6e736976652d6a51756572792d496d6167652d4c69676874626f782d506c7567696e2d73696d706c652d6c69676874626f782e6a7067", "https://static.wixstatic.com/media/65c017_714476b99e2f42929c4a8fd13725d5ce.png/v1/fill/w_445,h_445,al_c/65c017_714476b99e2f42929c4a8fd13725d5ce.png"))
        listArticles.add(Articles("Mr.T", "Ngày hôm nay tháng này năm 2018", "https://camo.mybb.com/e01de90be6012adc1b1701dba899491a9348ae79/687474703a2f2f7777772e6a71756572797363726970742e6e65742f696d616765732f53696d706c6573742d526573706f6e736976652d6a51756572792d496d6167652d4c69676874626f782d506c7567696e2d73696d706c652d6c69676874626f782e6a7067", "https://static.wixstatic.com/media/65c017_714476b99e2f42929c4a8fd13725d5ce.png/v1/fill/w_445,h_445,al_c/65c017_714476b99e2f42929c4a8fd13725d5ce.png"))
        listArticles.add(Articles("Mr.T", "Ngày hôm nay tháng này năm 2018", "https://camo.mybb.com/e01de90be6012adc1b1701dba899491a9348ae79/687474703a2f2f7777772e6a71756572797363726970742e6e65742f696d616765732f53696d706c6573742d526573706f6e736976652d6a51756572792d496d6167652d4c69676874626f782d506c7567696e2d73696d706c652d6c69676874626f782e6a7067", "https://static.wixstatic.com/media/65c017_714476b99e2f42929c4a8fd13725d5ce.png/v1/fill/w_445,h_445,al_c/65c017_714476b99e2f42929c4a8fd13725d5ce.png"))
        listArticles.add(Articles("Mr.T", "Ngày hôm nay tháng này năm 2018", "https://camo.mybb.com/e01de90be6012adc1b1701dba899491a9348ae79/687474703a2f2f7777772e6a71756572797363726970742e6e65742f696d616765732f53696d706c6573742d526573706f6e736976652d6a51756572792d496d6167652d4c69676874626f782d506c7567696e2d73696d706c652d6c69676874626f782e6a7067", "https://static.wixstatic.com/media/65c017_714476b99e2f42929c4a8fd13725d5ce.png/v1/fill/w_445,h_445,al_c/65c017_714476b99e2f42929c4a8fd13725d5ce.png"))
        listArticles.add(Articles("Mr.T", "Ngày hôm nay tháng này năm 2018", "https://camo.mybb.com/e01de90be6012adc1b1701dba899491a9348ae79/687474703a2f2f7777772e6a71756572797363726970742e6e65742f696d616765732f53696d706c6573742d526573706f6e736976652d6a51756572792d496d6167652d4c69676874626f782d506c7567696e2d73696d706c652d6c69676874626f782e6a7067", "https://static.wixstatic.com/media/65c017_714476b99e2f42929c4a8fd13725d5ce.png/v1/fill/w_445,h_445,al_c/65c017_714476b99e2f42929c4a8fd13725d5ce.png"))
        listArticles.add(Articles("Mr.T", "Ngày hôm nay tháng này năm 2018", "https://camo.mybb.com/e01de90be6012adc1b1701dba899491a9348ae79/687474703a2f2f7777772e6a71756572797363726970742e6e65742f696d616765732f53696d706c6573742d526573706f6e736976652d6a51756572792d496d6167652d4c69676874626f782d506c7567696e2d73696d706c652d6c69676874626f782e6a7067", "https://static.wixstatic.com/media/65c017_714476b99e2f42929c4a8fd13725d5ce.png/v1/fill/w_445,h_445,al_c/65c017_714476b99e2f42929c4a8fd13725d5ce.png"))
        listArticles.add(Articles("Mr.T", "Ngày hôm nay tháng này năm 2018", "https://camo.mybb.com/e01de90be6012adc1b1701dba899491a9348ae79/687474703a2f2f7777772e6a71756572797363726970742e6e65742f696d616765732f53696d706c6573742d526573706f6e736976652d6a51756572792d496d6167652d4c69676874626f782d506c7567696e2d73696d706c652d6c69676874626f782e6a7067", "https://static.wixstatic.com/media/65c017_714476b99e2f42929c4a8fd13725d5ce.png/v1/fill/w_445,h_445,al_c/65c017_714476b99e2f42929c4a8fd13725d5ce.png"))
        listArticles.add(Articles("Mr.T", "Ngày hôm nay tháng này năm 2018", "https://camo.mybb.com/e01de90be6012adc1b1701dba899491a9348ae79/687474703a2f2f7777772e6a71756572797363726970742e6e65742f696d616765732f53696d706c6573742d526573706f6e736976652d6a51756572792d496d6167652d4c69676874626f782d506c7567696e2d73696d706c652d6c69676874626f782e6a7067", "https://static.wixstatic.com/media/65c017_714476b99e2f42929c4a8fd13725d5ce.png/v1/fill/w_445,h_445,al_c/65c017_714476b99e2f42929c4a8fd13725d5ce.png"))
        Toast.makeText(this@MainActivity, "size items= ${listArticles.size} threshold=${threshold}", Toast.LENGTH_SHORT).show()
        addItem()
    }
}
