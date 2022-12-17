package com.example.bisenglish.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bisenglish.R
import com.google.android.material.imageview.ShapeableImageView

class NewsAdapter(private val dataList: ArrayList<DataClass2>): RecyclerView.Adapter<NewsAdapter.ViewHolderClass>() {

    class ViewHolderClass(itemView: View): RecyclerView.ViewHolder(itemView) {
        val image: ShapeableImageView = itemView.findViewById(R.id.image)
        val title: TextView = itemView.findViewById(R.id.title)
        val icon: ShapeableImageView = itemView.findViewById(R.id.icon)
        val date: TextView = itemView.findViewById(R.id.date)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.smm_layout, parent, false)
        return ViewHolderClass(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentItem = dataList[position]
        holder.image.setImageResource(currentItem.image)
        holder.icon.setImageResource(currentItem.icon)
        holder.title.text = currentItem.title
        holder.date.text = currentItem.time
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

}