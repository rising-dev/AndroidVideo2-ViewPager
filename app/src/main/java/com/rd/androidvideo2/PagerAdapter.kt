package com.rd.androidvideo2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerAdapter(activity: FragmentActivity, private val items: List<String>) : FragmentStateAdapter(activity) {

    override fun getItemCount() = items.size

    override fun createFragment(position: Int): Fragment {
        val text = items[position]
        return PageFragment.newInstance(text)
    }

}