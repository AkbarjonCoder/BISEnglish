package com.example.bisenglish.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bisenglish.adapter.DataClass
import com.example.bisenglish.R
import com.example.bisenglish.adapter.HomeAdapter

class HomeFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: ArrayList<DataClass>
    lateinit var numberList: ArrayList<String>
    lateinit var nameList: ArrayList<String>
//    lateinit var myAdapter: HomeAdapter
//    lateinit var deImage: ArrayList<Int>
//    lateinit var deTitle: ArrayList<String>

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        nameList = arrayListOf(
            "Beginner",
            "Elementary",
            "Preintermediate",
            "Intermediate",
            "Advanced",
        )

        numberList = arrayListOf(
            "A1",
            "A2",
            "B1",
            "B2",
            "C1"
        )

//        deTitle = arrayListOf(
//            "Learn English",
//            "Mental English",
//            "We Learn English",
//            "Study English",
//            "Magic English"
//        )
//
//        deImage = arrayListOf(
//            R.drawable.etheth,
//            R.drawable.pompom,
//            R.drawable.book1,
//            R.drawable.etheth,
//            R.drawable.pompom,
//            R.drawable.book1
//        )

        recyclerView = requireActivity().findViewById(R.id.rv1)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.setHasFixedSize(true)

        dataList = arrayListOf()
        getData()

//        myAdapter.onItemClick = {
//            val intent = Intent(context, TypeActivity::class.java)
//            intent.putExtra("androi", it)
//            startActivity(intent)
//        }

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)

    }

    private fun getData() {
        for (i in numberList.indices) {
            val dataClass = DataClass(numberList[i], nameList[i])
            dataList.add(dataClass)
        }
        recyclerView.adapter = HomeAdapter(dataList)
    }

}