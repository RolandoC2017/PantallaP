package com.example.pantallap.ZonaGamer

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
import com.example.pantallap.Telefono.Apple

class Teclados : Fragment() {

    companion object {
        fun newInstance() = Teclados()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.teclados, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycleZona)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("iPhone 11 128GB - Negro","S/ 4,599.00","3499",R.drawable.iphone11,
            "smart",false))

        productos.add(ProductosCardView("iPhone 11 128GB - Negro","S/ 4,599.00","3499",R.drawable.iphone11,
            "smart",false))

        productos.add(ProductosCardView("iPhone 11 128GB - Negro","S/ 4,599.00","3499",R.drawable.iphone11,
            "smart",false))

        productos.add(ProductosCardView("iPhone 11 128GB - Negro","S/ 4,599.00","3499",R.drawable.iphone11,
            "smart",false))

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