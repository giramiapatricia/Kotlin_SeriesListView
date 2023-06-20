package com.example.kotlin_series

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_series.ItemsViewModel

class CustomAdapter(private val mList:List<ItemsViewModel>):RecyclerView.Adapter<CustomAdapter.ViewHolder>(){
    //create new views

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
//inflates the card view design
        //that is used to list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.cardviewdesign,parent,false)
        return ViewHolder(view)
    }
    //binds a list items to a view
    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        val itemviewmodel=mList[position]
        //sets the image to imageview from our item holder class
        holder.imageview.setImageResource(itemviewmodel.Image)

        //sets the text to the textview from item holder class
        holder.textview.text = itemviewmodel.Text


    }
    //return number of items in the list
    override fun getItemCount(): Int {
        return mList.size

    }
    //Holds  the views for adding for adding into the image and
    class ViewHolder(ItemView:View):RecyclerView.ViewHolder(ItemView){
        val imageview:ImageView= itemView.findViewById(R.id.imagerv)
        val textview:TextView = itemView.findViewById(R.id.textitem)

    }
}