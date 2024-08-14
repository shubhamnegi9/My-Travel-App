package com.example.mytravelapp

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var imageView: ImageView? = null
    var prevBtn: ImageButton? = null
    var nextBtn: ImageButton? = null
    var placeTv: TextView? = null
    var currentIndex = 0
    val imageList = arrayOf(R.drawable.pic0, R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4)
    val namesList = arrayOf("India Gate", "Qutub Minar", "Akshar Dham", "Red Fort", "Lotus Temple")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        imageView = findViewById(R.id.imageView)
        prevBtn = findViewById(R.id.prevBtn)
        nextBtn = findViewById(R.id.nextBtn)
        placeTv = findViewById(R.id.placeTv)

        prevBtn?.setOnClickListener {
            currentIndex = (5+currentIndex-1)%5
            val imgId = imageList[currentIndex]
            imageView?.setImageResource(imgId)
            placeTv?.text = namesList[currentIndex]
        }

        nextBtn?.setOnClickListener {
            currentIndex = (5+currentIndex+1)%5
            val imgId = imageList[currentIndex]
            imageView?.setImageResource(imgId)
            placeTv?.text = namesList[currentIndex]
        }
    }
}