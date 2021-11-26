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
import com.example.pantallap.R

class AMD : Fragment() {

    companion object {
        fun newInstance() = AMD()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.amd, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycleCompo)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("Procesador AMD RYZEN 7 5700G 100-100000263BOX","S/ 4,506.00","2253",R.drawable.amdryzer7,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Marca: AMD\n" +
                    "Modelo: Ryzen™ 7 5700G\n" +
                    "Producto: Procesador\n" +
                    "Procesador: AMD Ryzen\n" +
                    "Núcleos: 8\n" +
                    "Hilos: 16\n" +
                    "Tipo de Memoria: DDR4\n" +
                    "Velocidad: 3.8 GHz\n" +
                    "Caché: 16MB\n" +
                    "Velocidad de reloj Maximo: Hasta 4.6GHz\n" +
                    "Plataforma PC\n" +
                    "Caché L2 total: 4MB\n" +
                    "Caché L3 total: 16MB\n" +
                    "Socket: AM4\n" +
                    "TDP: 65W\n" +
                    "Velocidad máxima de memoria: 3200MHz",false))

        productos.add(ProductosCardView("Procesador Amd Ryzen Threadripper 3960x","S/ 17,660.00","8835",R.drawable.amdryzer3960,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Familia de CPU AMD Ryzen Threadripper\n" +
                    "Velocidad de CPU 3.8 GHz\n" +
                    "Número de procesador 3960X\n" +
                    "Tipo de CPU AMD Ryzen Threadripper.\n" +
                    "Fabricante de CPU AMD\n" +
                    "Núcleos de CPU Veinticuatro núcleos\n" +
                    "CPU Socket Socket sTRX4\n" +
                    "CPU marca AMD\n" +
                    "CPU TDP 280 W\n" +
                    "Caché 140 MB\n" +
                    "Subprocesos de CPU 48\n" +
                    "Procesador Turbo Speed 4.5 GHz",false))

        productos.add(ProductosCardView("Procesador AMD RYZEN 9 5950X 100-100000059WOF","S/ 4,599.00","3499",R.drawable.amdryzer9,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Marca: AMD\n" +
                    "Modelo: Ryzen 9 5950X\n" +
                    "Socket: AM4\n" +
                    "Frecuencia del procesador: 3.4GHz\n" +
                    "Frecuencia del procesador turbo: 4.9GHz\n" +
                    "Número de núcleos: 16\n" +
                    "Litografía del procesador: 32\n" +
                    "Refrigerador incluido: NO\n" +
                    "Cache del procesador: 72MB\n" +
                    "Tipo de memoria que soporta: DDR4\n" +
                    "Velocidad del reloj de memoria: 3200MHz\n" +
                    "Potencia del diseño termico (TDP): 105W\n" +
                    "Gráficos integrados: NO",false))

        productos.add(ProductosCardView("AMD Ryzen 7 3700X 3.6 GHz Eight-Core AM4 Processor","S/ 2,929.00","2089",R.drawable.amdryzer73700,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "8 Núcleos Y 16 Hilos\n" +
                    "Reloj Base De 3,6 Ghz\n" +
                    "Reloj De Impulso Máximo De 4,4 Ghz\n" +
                    "Zócalo Am4\n" +
                    "Caché De 4 Mb L2 Y 32 Mb L3\n" +
                    "Memoria Ddr4-3200 De Doble Canal\n" +
                    "Soporta Pcie 4.0 X16\n" +
                    "Refrigerador Led Wraith Prism Rgb Incluido\n" +
                    "Producto Nuevo Y Original.\n" +
                    "Ficha Técnica En La Descripción Del Producto.\n" +
                    "Producto Importado De Usa.",false))

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