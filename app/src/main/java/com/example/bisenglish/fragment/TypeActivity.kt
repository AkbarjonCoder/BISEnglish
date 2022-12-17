package com.example.bisenglish.fragment

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.bisenglish.R
import com.example.bisenglish.adapter.DataClass
import com.google.android.material.imageview.ShapeableImageView

class TypeActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_type)
//
//        val getData = intent.getParcelableExtra<DataClass>("android")
//        if (getData != null) {
//            val deTitle: TextView = findViewById(R.id.image)
//            val deImage: ShapeableImageView = findViewById(R.id.title)
//
//            deTitle.text = getData.deTitle
//            deImage.setImageResource(getData.deImage)
//
//        }
    }}