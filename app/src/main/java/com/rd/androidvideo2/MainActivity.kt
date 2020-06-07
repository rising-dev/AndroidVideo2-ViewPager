package com.rd.androidvideo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val items = listOf(
        "Card1",
        "Card2",
        "Card3",
        "Card4",
        "Card5"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPagerVertical.adapter = PagerAdapter(this, items)
        viewPagerHorizontal.adapter = PagerAdapter(this, items)
    }
}