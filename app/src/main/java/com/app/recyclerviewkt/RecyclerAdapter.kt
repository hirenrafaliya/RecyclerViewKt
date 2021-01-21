package com.app.recyclerviewkt

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_recycler.view.*

class RecyclerAdapter(private val context: Context, private val itemList: List<Item>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.img.setImageResource(itemList[position].img)
        holder.itemView.tvTitle.text = itemList[position].title
        holder.itemView.tvDesc.text = itemList[position].desc
        holder.itemView.layoutParent.setOnClickListener {
            Toast.makeText(context, itemList[position].title, Toast.LENGTH_SHORT).show() }
        holder.itemView.layoutParent.clipToOutline = true
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    }
}