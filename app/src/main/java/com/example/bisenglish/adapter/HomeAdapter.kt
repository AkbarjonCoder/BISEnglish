package com.example.bisenglish.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bisenglish.R

class HomeAdapter(private val dataList: ArrayList<DataClass>): RecyclerView.Adapter<HomeAdapter.ViewHolderClass>() {

//    var onItemClick: ((DataClass) -> Unit)? = null

    class ViewHolderClass(itemView: View): RecyclerView.ViewHolder(itemView) {
        val number: TextView = itemView.findViewById(R.id.number)
        val title: TextView = itemView.findViewById(R.id.name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolderClass(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentItem = dataList[position]
        holder.number.text = currentItem.number
        holder.title.text = currentItem.title

//        holder.itemView.setOnClickListener {
//            onItemClick?.invoke(currentItem)
//        }

    }

    override fun getItemCount(): Int {
        return dataList.size
    }

}