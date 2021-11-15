package com.example.pantallap.Telefono

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pantallap.Adapters.ProductosAdapterCV
import com.example.pantallap.Data.ProductosCardView
import com.example.pantallap.R

class Huawei : Fragment() {

    private lateinit var linear: LinearLayout

    companion object {
        fun newInstance() = Huawei()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.huawei, container, false)

        //linear = root.findViewById<LinearLayout>(R.id.pop1)

       // linear!!.setOnClickListener { startActivity(Intent(context, InfoHuawei1::class.java)) }

        var recyclerView:RecyclerView = root.findViewById<RecyclerView>(R.id.recycle2)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("Huawei Mate 30 Pro 256GB 8GB RAM Plata","S/ 4,599.00","3299",R.drawable.huaweimate,"ANDROID 10"))
        productos.add(ProductosCardView("Huawei P40 128GB 8GB AZUL","S/ 2,699.00","2399",R.drawable.huaweip40,"ANDROID 10"))
        productos.add(ProductosCardView("Huawei P30 Pro 256GB-Black","S/ 3,999.00","2799",R.drawable.huaweip30,"ANDROID 10"))
        productos.add(ProductosCardView("HUAWEI Y9A 128gb 6gb Ram Dual Sim","S/ 1,299.00","1250",R.drawable.huaweiy9,"ANDROID 10"))
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