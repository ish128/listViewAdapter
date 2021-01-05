package com.my.listviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    val list = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list.add("A")
        list.add("B")
        list.add("C")
        list.add("D")
        list.add("E")

        val listAdapter = MainListAdapter(this, list)
        val listView = findViewById<ListView>(R.id.list_view)
        listView.adapter = listAdapter
    }
}