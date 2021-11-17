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

class LG : Fragment() {

    companion object {
        fun newInstance() = LG()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.lg, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycle3)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("LG STYLUS 3 3GB RAM 16GB 13MP - titanio","S/ 899.00","469",R.drawable.lgstylus,"ANDROID 10",false))
        productos.add(ProductosCardView("LG Smartphone 6.5 K51S 3GB 64GB 5 Camaras LM-K510HM - Titan","S/ 997.00","697",R.drawable.lgsmartphone,"ANDROID 10",false))
        productos.add(ProductosCardView("LG VELVET 5G AURORA PLATA CELULAR","S/ 2,999.00","1499.00",R.drawable.lgvelvet,"ANDROID 10",false))
        productos.add(ProductosCardView("LG K20 16GB 1GB RAM - Negro","S/ 690.00","389",R.drawable.lgk20,"ANDROID 10",false))
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