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

class VRBox : Fragment() {

    companion object {
        fun newInstance() = VRBox()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.vrbox, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycleRealidad)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("Lentes de Realidad Virtual TITI VR 3D Para Smartphone","S/ 40.00","16",R.drawable.vrboxtiti,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Compatible con iOS Y Android\n" +
                    "Exelente calidad y Diseño ergonomico\n" +
                    "Material de alta calidad : Plastico ABS\n" +
                    "Angulo de vision (FOV): 100%\n" +
                    "Mira formato de video 3D de 180 y 360 grados\n" +
                    "Ideal para smarphone de 3.5 a 6.0 pulgadas \n" +
                    "Distancia focal y distancia de pupila ajustable",false))

        productos.add(ProductosCardView("Lentes De Realidad Virtual VR BOX 3D Para Smartphone","S/ 69.00","36",R.drawable.vrbox3d,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Distancia focal y distancia de pupila ajustable\n" +
                    "Exelente calidad y Diseño ergonomico\n" +
                    "Material de alta calidad : Plastico ABS\n" +
                    "Angulo de vision (FOV): 100%\n" +
                    "Mira formato de video 3D de 180 y 360 grados\n" +
                    "Ideal para smarphone de 3.5 a 6.0 pulgadas \n" +
                    "Control A Distancia BLUEOOTH",false))

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