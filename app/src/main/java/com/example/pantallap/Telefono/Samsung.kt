package com.example.pantallap.Telefono

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pantallap.Adapters.ProductosAdapterCV
import com.example.pantallap.Data.ProductosCardView
import com.example.pantallap.R

class Samsung : Fragment() {

    companion object {
        fun newInstance() = Samsung()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.samsung, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycle5)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("Samsung Galaxy Note 20 ULTRA 256GB Ram 8GB - Negro","S/ 5,900.00","4499",R.drawable.samsungnote20,"ANDROID 10"))
        productos.add(ProductosCardView("Samsung Galaxy S10 Plus SM G975U 128GB - Azul","S/ 2,199.00","1759",R.drawable.samsungs10,"ANDROID 10"))
        productos.add(ProductosCardView("Samsung Galaxy A52s 5G Negro","S/ 1,999.00","1899",R.drawable.samsunga52,"ANDROID 10"))
        productos.add(ProductosCardView("Samsung Galaxy S9 Plus SM-G965U 64GB Púrpura","S/ 2,659.00","919",R.drawable.samsungs9,"ANDROID 10"))
        var adapter = ProductosAdapterCV(productos)

        //recyclerView.layoutManager = LinearLayoutManager(root.context,LinearLayoutManager.VERTICAL,false)
        recyclerView.layoutManager = GridLayoutManager(root.context,2)
        recyclerView.adapter = adapter

        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

}