package com.app.recyclerviewkt

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_recycler_img.view.*

class RecyclerAdapter(private val context: Context, private val itemList: List<Item>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return if (viewType == 0) {
            ViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_recycler_img, parent, false)
            )
        } else {
            ViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_recycler_text, parent, false)
            )
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (getItemViewType(position) == 0) {
            holder.itemView.img.setImageResource(itemList[position].img)
            holder.itemView.tvTitle.text = itemList[position].title
            holder.itemView.tvDesc.text = itemList[position].desc
            holder.itemView.layoutParent.setOnClickListener {
                Toast.makeText(context, itemList[position].title, Toast.LENGTH_SHORT).show()
            }
            holder.itemView.layoutParent.clipToOutline = true
        } else if (getItemViewType(position) == 1) {
            holder.itemView.tvTitle.text = itemList[position].title
            holder.itemView.layoutParent.setOnClickListener {
                Toast.makeText(context, itemList[position].title, Toast.LENGTH_SHORT).show()
            }
        }

    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun getItemViewType(position: Int): Int {
        return when (itemList[position].type) {
            "img" -> {
                0;
            }
            "text" -> {
                1;
            }
            else -> -1
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}