package com.appsolution.fluttertestcrowth.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.appsolution.fluttertestcrowth.R
import java.util.ArrayList

class ListAdapter(private val list: ArrayList<Int>):
    RecyclerView.Adapter<ListAdapter.ListViewHolder>(){

    class ListViewHolder(private val v: View) : RecyclerView.ViewHolder(v){


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return list.size
    }

}