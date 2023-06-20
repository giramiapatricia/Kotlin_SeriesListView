package com.example.kotlin_series

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.getSystemService
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.kotlin_series.CountryModel

class MyAdapter(private var activity:Activity,private var items:ArrayList<CountryModel> ):
    BaseAdapter() {
    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(position: Int): CountryModel {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view:View?
        val viewHolder:ViewHolder

        if (convertView == null){
            val inflater = activity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            // layout inflater is used to get view object which you define layouts
            view = inflater.inflate(R.layout.list_item_layout,null)
            viewHolder = ViewHolder(view)
            view?.tag = viewHolder
        } else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        val countries = items[position]
        viewHolder.textName?.text = countries.name
        viewHolder.textDes?.text = countries.description
//        viewHolder.textFlag?.setImageResource(R.drawable.baseline_account_circle_24)
        viewHolder.textFlag?.setImageResource(countries.flag)
        return view as View
    }
    private class ViewHolder(row:View?){
        var textName:TextView? = null
        var textDes:TextView? = null
        var textFlag:ImageView? = null

        init {
            textName = row?.findViewById(R.id.textcountry)
            textDes = row?.findViewById(R.id.textdes)
            textFlag = row?.findViewById(R.id.imageView8)
        }
    }
}