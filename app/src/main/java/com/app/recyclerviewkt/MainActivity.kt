package com.app.recyclerviewkt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemList: MutableList<Item> = ArrayList()

        itemList.add(Item(R.drawable.s1, "The word nature is borrowed from the Old French", "Nature and is derived from the Latin word natura, essential qualities, innate disposition and in ancient times, literally meant. In ancient philosophy, natura is mostly used as the Latin translation of the Greek word physis","img"))
        itemList.add(Item(R.drawable.s6, "Earth has evolved through geological", "","text"))
        itemList.add(Item(R.drawable.s6, "Geology is the science and study of the solid and liquid matter", "","text"))
        itemList.add(Item(R.drawable.s2, "Within the various uses of the word", "today often refers to geology and wildlife. Nature can refer to the general realm of living plants and animals","img"))
        itemList.add(Item(R.drawable.s3, "Earth is the only planet known to support life", "and its natural features are the subject of many fields of scientific research. Within the solar system, it is third closest to the sun","img"))
        itemList.add(Item(R.drawable.s6, "The atmospheric conditions have been significantly", "","text"))
        itemList.add(Item(R.drawable.s4, "Earth has evolved through geological ", "biological processes that have left traces of the original conditions. The outer surface is divided into several gradually migrating tectonic plates","img"))
        itemList.add(Item(R.drawable.s6, "Earth has evolved through geological", "","text"))
        itemList.add(Item(R.drawable.s5, "The atmospheric conditions have been significantly altered", " Despite the wide regional variations in climate by latitude and other geographic factors, the long-term average global climate is quite stable during interglacial periods","img"))
        itemList.add(Item(R.drawable.s6, "Geology is the science and study of the solid and liquid matter", "he field of geology encompasses the study of the composition, structure, physical properties, dynamics, and history of Earth materials, and the processes","img"))


        val recyclerAdapter = RecyclerAdapter(this, itemList)
        recyclerView.adapter = recyclerAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}