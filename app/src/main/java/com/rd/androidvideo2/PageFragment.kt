package com.rd.androidvideo2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_page.*

class PageFragment : Fragment() {

    private val text: String? by lazy {
        arguments?.getString(TEXT_KEY)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pageText.text = text
    }

    companion object {

        const val TEXT_KEY = "textKey"

        fun newInstance(text: String) =
            PageFragment().apply {
                arguments = Bundle().apply {
                    putString(TEXT_KEY, text)
                }
            }
    }
}