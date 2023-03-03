package com.example.world

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class Poster_adapter(val con:Context, val list2:ArrayList<Poster>):
    RecyclerView.Adapter<Poster_adapter.link>() {
    class link(itemView:View):RecyclerView.ViewHolder(itemView) {
        val im_di: ImageView =itemView.findViewById(R.id.image)
        val text_di: TextView =itemView.findViewById(R.id.title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Poster_adapter.link {
        val root=LayoutInflater.from(con).inflate(R.layout.poster_item,parent,false)
        return link(root)
    }

    override fun onBindViewHolder(holder: Poster_adapter.link, position: Int) {
        holder.im_di.setImageResource(list2[position].imgId)
        holder.text_di.setText(list2[position].title)
    }

    override fun getItemCount(): Int {
        return list2.size
    }
}