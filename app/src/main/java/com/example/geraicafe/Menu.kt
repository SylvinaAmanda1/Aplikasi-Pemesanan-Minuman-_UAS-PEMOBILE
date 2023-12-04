package com.example.geraicafe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Menu : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.menu, container, false)
        val recy = view.findViewById<View>(R.id.recy) as RecyclerView
        val data = ArrayList<Data>()
        data.add(Data(1, "Strawberry Cream Frappuccino", "60.000", R.raw.menu1))
        data.add(Data(2, "Coklat Cream Frappuccino", "55.000", R.raw.menu3))
        data.add(Data(3, "Green Tea Cream Frappuccino", "50.000", R.raw.menu4))
        data.add(Data(4, "Coklat Caramel Frappuccino", "60.000", R.raw.menu5))
        data.add(Data(5, "Coffe Cream Frappuccino", "50.000", R.raw.menu2))

        val linearLayoutManager = GridLayoutManager(context, 3)
        recy.layoutManager = linearLayoutManager
        val adapter = context?.let { RecyAdapter(it, data) }
        recy.adapter = adapter
        return view
    }
}