package com.example.firstproject

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var txtName: TextView
    private lateinit var txtGroup: TextView
    private lateinit var txtAName: TextView
    private var changed = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtName = findViewById(R.id.myname)
        txtGroup = findViewById(R.id.mygroup)
        txtAName = findViewById(R.id.aname)
    }
        fun changeText(view: View) {

            if(changed) {
                txtName.setTextColor(Color.parseColor("#A9B1FD"))
                txtAName.setTextColor(Color.parseColor("#A9B1FD"))
                txtGroup.setTextColor(Color.parseColor("#A9B1FD"))
                txtName.setBackgroundColor(Color.parseColor("#853030"))
                txtAName.setBackgroundColor(Color.parseColor("#853030"))
                txtGroup.setBackgroundColor(Color.parseColor("#853030"))
                changed = false
            }
            else{
                txtName.setTextColor(Color.parseColor("#853030"))
                txtAName.setTextColor(Color.parseColor("#853030"))
                txtGroup.setTextColor(Color.parseColor("#853030"))
                txtName.setBackgroundColor(Color.parseColor("#A9B1FD"))
                txtAName.setBackgroundColor(Color.parseColor("#A9B1FD"))
                txtGroup.setBackgroundColor(Color.parseColor("#A9B1FD"))
                changed = true
            }
        }
    }