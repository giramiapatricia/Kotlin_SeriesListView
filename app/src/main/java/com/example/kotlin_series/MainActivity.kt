package com.example.kotlin_series

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ArrayAdapter
import android.widget.ListView

// let me make a change to commit
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listview: ListView = findViewById<ListView>(R.id.listv)

        var adapter = MyAdapter(this,generatedata())
        listview?.adapter = adapter
        adapter?.notifyDataSetChanged()

//        val eastAfricanCountries = arrayOf("uganda","kenya","Tanzania","congo","rwanda")
//        val arrayAdapter:ArrayAdapter<*>
//        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,eastAfricanCountries)
//        // connect listview with adapter
//        listview.adapter = arrayAdapter

        Handler().postDelayed({
            val intent = Intent(this, RecyclerView::class.java)
            startActivity(intent)
        }, 3000)
    }

    private fun generatedata():ArrayList<CountryModel>{
        val result = ArrayList<CountryModel>()
        var country1:CountryModel = CountryModel("Uganda","Pearl of Africa",
            R.drawable.uganda_by_awesomemasks___redbubble
        )
        var country2:CountryModel = CountryModel("Kenya","Horn of Africa",
            R.drawable.kenya_flag_large_decal
        )
        var country3:CountryModel = CountryModel("Tanzania","Peace of Africa", R.drawable.tanzania)

       result.add(country1)
        result.add(country2)
        result.add(country3)

        return result
    }
}