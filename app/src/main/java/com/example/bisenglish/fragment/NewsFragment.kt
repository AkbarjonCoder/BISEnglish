package com.example.bisenglish.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bisenglish.R
import com.example.bisenglish.adapter.DataClass2
import com.example.bisenglish.adapter.NewsAdapter

class NewsFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: ArrayList<DataClass2>
    private lateinit var imageList: ArrayList<Int>
    private lateinit var nameList: ArrayList<String>
    private lateinit var iconList: ArrayList<Int>
    private lateinit var timeList: ArrayList<String>

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        nameList = arrayListOf(
            "Speaking Club",
            "Mock Exam",
            "Table Tennis",
            "Battle of Blanches",
            "Navbat Sizniki",
            "Movie Club",
            "Ingliz Tili",
            "Zakovat",
        )

        timeList = arrayListOf(
            "01.10.2022",
            "05.10.2022",
            "12.10.2022",
            "16.10.2022",
            "19.10.2022",
            "24.10.2022",
            "29.10.2022",
            "31.10.2022",
        )

        imageList = arrayListOf(
            R.drawable.smm,
            R.drawable.smm2,
            R.drawable.smm3,
            R.drawable.smm4,
            R.drawable.smm5,
            R.drawable.smm6,
            R.drawable.smm7,
            R.drawable.smm8,
        )

        iconList = arrayListOf(
            R.drawable.ic_baseline_date_range_24,
            R.drawable.ic_baseline_date_range_24,
            R.drawable.ic_baseline_date_range_24,
            R.drawable.ic_baseline_date_range_24,
            R.drawable.ic_baseline_date_range_24,
            R.drawable.ic_baseline_date_range_24,
            R.drawable.ic_baseline_date_range_24,
            R.drawable.ic_baseline_date_range_24,
        )

        recyclerView = requireActivity().findViewById(R.id.rv1)
        recyclerView.layoutManager = GridLayoutManager(context, 2, GridLayoutManager.VERTICAL, false)
        recyclerView.setHasFixedSize(true)

        dataList = arrayListOf()
        getData()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_news, container, false)
    }

    private fun getData() {
        for (i in imageList.indices) {
            val dataClass = DataClass2(imageList[i],nameList[i], timeList[i], iconList[i])
            dataList.add(dataClass)
        }
        recyclerView.adapter = NewsAdapter(dataList)
    }

}