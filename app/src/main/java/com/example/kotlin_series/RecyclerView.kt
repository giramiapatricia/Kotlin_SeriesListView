package com.example.kotlin_series

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        // large android class that provides flexible use of data sets
        // recycles views instead of using new ones
        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        // create vertical layout manager
        recyclerView.layoutManager = LinearLayoutManager(this)
        // create arraylist of items view model
        val data = ArrayList<ItemsViewModel>()
        // create loop to create 20 views containing image with count of view
        for (i in 1..20){
            data.add(ItemsViewModel(R.drawable.baseline_account_circle_24, "item$i"))
        }
        // pass array list to adapter
        val adapter = CustomAdapter(data)
        // set adapter with recycler view
        recyclerView.adapter = adapter
    }
}