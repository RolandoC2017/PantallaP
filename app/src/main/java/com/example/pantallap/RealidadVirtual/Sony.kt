package com.example.pantallap.RealidadVirtual

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

class Sony : Fragment() {

    companion object {
        fun newInstance() = Sony()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_sony, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycleRealidad)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("Gafas de Realidad Virtual Sony Play Station VR CUH-ZVR2","S/ 3,849.00","3149",R.drawable.sonyvr,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Gafas De Realidad Virtual\n" +
                    "Pantalla Oled 5.7\"\n" +
                    "Resolución Full Hd (1920X1080)\n" +
                    "Taza De Refresh 120Hz - 90Hz\n" +
                    "Angulo Visión De 100°\n" +
                    "Auriculares Incorporados (Audio 3D) - Cámara - Controles Play Station Vr. \n" +
                    "Incluye Varios Juegos De Iniciación Al Mundo Virtual\n" +
                    "Condición: Nuevo",false))

        productos.add(ProductosCardView("Gafas de Realidad Virtual Sony Play Station VR BLOOD TRUTH","S/ 3,809.00","3109",R.drawable.sonyvrblood,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Marca: SONY\n" +
                    "Pantalla: OLED 5.7\"\n" +
                    "Resolución: Full HD (1920×1080)\n" +
                    "TAZA DE REFRESH 120HZ - 90HZ\n" +
                    "ANGULO VISION DE 100°\n" +
                    "INCLUYE AURICULARES - CAMARA - CONTROLES PLAY STATION VR\n" +
                    "Condición: Nuevo",false))

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