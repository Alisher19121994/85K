package com.best.a85k.RecyclerViewAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.best.a85k.R

import kotlinx.android.synthetic.main.activity_adapter_pager2.view.*


class AdapterPager2 (var list: ArrayList<String>): RecyclerView.Adapter<AdapterPager2.MyView>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyView {
        val view =
            LayoutInflater.from(parent.context).inflate(com.best.a85k.R.layout.activity_adapter_pager2, parent, false)
        return MyView(view)
    }

    override fun onBindViewHolder(holder: MyView, position: Int) {
       val get = list[position]
        if (holder is MyView){
           val a =  holder.textView1
           val b =  holder.textView2
            a.text = get
            b.text = get
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

     class MyView(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView1: TextView = itemView.findViewById(R.id.text_Users_ID)
        val textView2: TextView = itemView.findViewById(R.id.text_UsersNumber_ID)

    }
}