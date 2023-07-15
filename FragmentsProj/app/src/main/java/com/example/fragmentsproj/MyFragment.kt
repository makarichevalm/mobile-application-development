package com.example.fragmentsproj

import android.R.attr.button
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment


class MyFragment : Fragment() {
    private lateinit var fragmentLayout:View
    private lateinit var txtName: TextView
    private lateinit var txtGroup: TextView
    private lateinit var txtAName: TextView
    private var changed = true

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentLayout = inflater.inflate(R.layout.fragment_my, container, false)
        txtName = fragmentLayout.findViewById(R.id.myname)
        txtGroup = fragmentLayout.findViewById(R.id.mygroup)
        txtAName = fragmentLayout.findViewById(R.id.aname)
        val but: Button = fragmentLayout.findViewById(R.id.bChange)
        but.setOnClickListener {
            if (changed) {
                txtName.setTextColor(Color.parseColor("#A9B1FD"))
                txtAName.setTextColor(Color.parseColor("#A9B1FD"))
                txtGroup.setTextColor(Color.parseColor("#A9B1FD"))
                txtName.setBackgroundColor(Color.parseColor("#853030"))
                txtAName.setBackgroundColor(Color.parseColor("#853030"))
                txtGroup.setBackgroundColor(Color.parseColor("#853030"))
                changed = false
            } else {
                txtName.setTextColor(Color.parseColor("#853030"))
                txtAName.setTextColor(Color.parseColor("#853030"))
                txtGroup.setTextColor(Color.parseColor("#853030"))
                txtName.setBackgroundColor(Color.parseColor("#A9B1FD"))
                txtAName.setBackgroundColor(Color.parseColor("#A9B1FD"))
                txtGroup.setBackgroundColor(Color.parseColor("#A9B1FD"))
                changed = true
            }
        }
        return fragmentLayout
    }
}