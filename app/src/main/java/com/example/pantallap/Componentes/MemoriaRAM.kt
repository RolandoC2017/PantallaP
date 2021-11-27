package com.example.pantallap.Componentes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pantallap.Adapters.ProductosAdapterCV
import com.example.pantallap.Data.ProductosCardView
import com.example.pantallap.Pc.Acer
import com.example.pantallap.R

class MemoriaRAM : Fragment() {

    companion object {
        fun newInstance() = MemoriaRAM()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.memoria_r_a_m, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycleCompo)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("MEMORIA RAM T-FORCE DELTA RGB 8GB 3200MHZ BLACK DDR4","S/ 249.00","229",R.drawable.memoriaramtforce,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Iluminación ultra gran angular de 120° con bastidor completo\n" +
                    "Efecto de iluminación RGB de Flujo Force integrado\n" +
                    "Difusor térmico de aleación de aluminio con diseño asimétrico minimalista\n" +
                    "Compatible con sincronización del software ASUS Aura Sync\n" +
                    "EL PCB más reciente de la JEDEC RC 2.0\n" +
                    "Voltaje de funcionamiento ultrabajo de 1.2 V a 1.4 V que ahorra energía\n" +
                    "Compatible con la tecnología de sobreaceleración de un solo clic XMP 2.0\n" +
                    "Con aprobación QVL por parte de todos los fabricantes de placas madre convencionales",false))

        productos.add(ProductosCardView("Memoria Ram THERMALTAKE TOUGHRAM RGB 16GB - (2 x 8GB) DDR4","S/ 939.00","729",R.drawable.memoriaram16,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Para PC\n" +
                    "Capacidad: 16GB (2 x 8GB)\n" +
                    "Tipo: DDR4\n" +
                    "Velocidad: 4000MHZ, PC4-32000\n" +
                    "Voltaje: 1.35V\n" +
                    "Pines: 288\n" +
                    "Incluye Disipador RGB\n" +
                    "Condición: Nuevo",false))

        productos.add(ProductosCardView("MEMORIA RAM XPG GAMMIX D10 8GB 2666MHZ DDR4","S/ 220.00","195",R.drawable.memoriaram8,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Diseño único del disipador de calor\n" +
                    "Disipador térmico de perfil bajo para una instalación sin esfuerzo\n" +
                    "DDR4 - gran rendimiento y eficiencia energética\n" +
                    "Excelente enfriamiento y estabilidad\n" +
                    "Intel XMP 2.0 - overclocking más accesible",false))

        productos.add(ProductosCardView("Memoria Ram TeamGroup T-Force Vulcan Z, 16GB,DDR4, 2.66GHZ","S/ 4,599.00","3499",R.drawable.memoriaramteamgroup,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Marca: TeamGroup\n" +
                    "Modelo: TLZRD416G2666HC18H01\n" +
                    "Capacidad 16GB\n" +
                    "Tipo DDR4\n" +
                    "Frecuencia 2.66GHZ",false))

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