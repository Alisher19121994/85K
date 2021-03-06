package com.best.a85k.RecyclerViewAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.best.a85k.R
import kotlinx.android.synthetic.main.activity_adapter_pager1.view.*


class AdapterPager1(private var list: ArrayList<String>) : RecyclerView.Adapter<AdapterPager1.MyView>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyView {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_adapter_pager1, parent, false)
        return MyView(view)
    }

    override fun onBindViewHolder(holder: MyView, position: Int) {
        val get = list[position]
        if (holder is MyView) {
           val a =  holder.textView
            a.text=get
        }


    }

    override fun getItemCount(): Int {
        return list.size
    }
     class MyView(itemView: View) : RecyclerView.ViewHolder(itemView) {

       var textView: TextView = itemView.findViewById(R.id.text_Contacts_ID)

    }

}