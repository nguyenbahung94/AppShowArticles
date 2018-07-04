package com.example.nbhung.appshowarticles

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.nbhung.appshowarticles.model.Articles

class MainActivity : AppCompatActivity() {
    private var listArticles = ArrayList<Articles>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createDataForListArticles()

    }

    private fun createDataForListArticles() {
        listArticles.add(Articles("hung", "day la noi dung", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDcovVt2dhGNvtteG7ijtOyfA7zFjnv5f5zzjwzjPyPXvOnI_h", "http://www.youtube.com/watch?v=1FJHYqE0RDg"))
        listArticles.add(Articles("hung", "day la noi dung", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDcovVt2dhGNvtteG7ijtOyfA7zFjnv5f5zzjwzjPyPXvOnI_h", "http://www.youtube.com/watch?v=1FJHYqE0RDg"))
        listArticles.add(Articles("hung", "day la noi dung", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDcovVt2dhGNvtteG7ijtOyfA7zFjnv5f5zzjwzjPyPXvOnI_h", "http://www.youtube.com/watch?v=1FJHYqE0RDg"))
        listArticles.add(Articles("hung", "day la noi dung", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDcovVt2dhGNvtteG7ijtOyfA7zFjnv5f5zzjwzjPyPXvOnI_h", "http://www.youtube.com/watch?v=1FJHYqE0RDg"))
        listArticles.add(Articles("hung", "day la noi dung", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDcovVt2dhGNvtteG7ijtOyfA7zFjnv5f5zzjwzjPyPXvOnI_h", "http://www.youtube.com/watch?v=1FJHYqE0RDg"))
        listArticles.add(Articles("hung", "day la noi dung", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDcovVt2dhGNvtteG7ijtOyfA7zFjnv5f5zzjwzjPyPXvOnI_h", "http://www.youtube.com/watch?v=1FJHYqE0RDg"))
        listArticles.add(Articles("hung", "day la noi dung", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDcovVt2dhGNvtteG7ijtOyfA7zFjnv5f5zzjwzjPyPXvOnI_h", "http://www.youtube.com/watch?v=1FJHYqE0RDg"))
        listArticles.add(Articles("hung", "day la noi dung", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDcovVt2dhGNvtteG7ijtOyfA7zFjnv5f5zzjwzjPyPXvOnI_h", "http://www.youtube.com/watch?v=1FJHYqE0RDg"))
        listArticles.add(Articles("hung", "day la noi dung", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDcovVt2dhGNvtteG7ijtOyfA7zFjnv5f5zzjwzjPyPXvOnI_h", "http://www.youtube.com/watch?v=1FJHYqE0RDg"))
        listArticles.add(Articles("hung", "day la noi dung", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDcovVt2dhGNvtteG7ijtOyfA7zFjnv5f5zzjwzjPyPXvOnI_h", "http://www.youtube.com/watch?v=1FJHYqE0RDg"))
        listArticles.add(Articles("hung", "day la noi dung", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDcovVt2dhGNvtteG7ijtOyfA7zFjnv5f5zzjwzjPyPXvOnI_h", "http://www.youtube.com/watch?v=1FJHYqE0RDg"))
        listArticles.add(Articles("hung", "day la noi dung", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDcovVt2dhGNvtteG7ijtOyfA7zFjnv5f5zzjwzjPyPXvOnI_h", "http://www.youtube.com/watch?v=1FJHYqE0RDg"))
        listArticles.add(Articles("hung", "day la noi dung", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDcovVt2dhGNvtteG7ijtOyfA7zFjnv5f5zzjwzjPyPXvOnI_h", "http://www.youtube.com/watch?v=1FJHYqE0RDg"))
        listArticles.add(Articles("hung", "day la noi dung", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDcovVt2dhGNvtteG7ijtOyfA7zFjnv5f5zzjwzjPyPXvOnI_h", "http://www.youtube.com/watch?v=1FJHYqE0RDg"))
        listArticles.add(Articles("hung", "day la noi dung", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDcovVt2dhGNvtteG7ijtOyfA7zFjnv5f5zzjwzjPyPXvOnI_h", "http://www.youtube.com/watch?v=1FJHYqE0RDg"))
        listArticles.add(Articles("hung", "day la noi dung", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDcovVt2dhGNvtteG7ijtOyfA7zFjnv5f5zzjwzjPyPXvOnI_h", "http://www.youtube.com/watch?v=1FJHYqE0RDg"))
        listArticles.add(Articles("hung", "day la noi dung", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDcovVt2dhGNvtteG7ijtOyfA7zFjnv5f5zzjwzjPyPXvOnI_h", "http://www.youtube.com/watch?v=1FJHYqE0RDg"))

    }
}
