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

class DiscoDuro : Fragment() {

    companion object {
        fun newInstance() = DiscoDuro()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.disco_duro, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycleCompo)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("Disco Duro PC-500GB Seagate PULL-Plateado","S/ 190.00","110",R.drawable.discoduropc500,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "MARCA: SEAGATE\n" +
                    "MODELO: ST3500414CS\n" +
                    "CAPACIDAD: 500G\n" +
                    "BINTERFAZ: SATA 3.0 Gb/s\n" +
                    "VELOCIDAD DE ROTACION: 5900 RPM\n" +
                    "VELOCIDAD DE ACCESO: 5.1 MS\n" +
                    "VELOCIDAD DE TRANSFERENCIA: 3 GB/SCACHE: 16 MB\n" +
                    "FORMATO: 3.5 PULG·\n" +
                    "DIMENSIONES: 20.2 x 10.16 x 14.70 CM",false))

        productos.add(ProductosCardView("Disco Duro Pc Seagate Pipeline HD 1tb Sata 6 Gbs 5900","S/ 249.00","180",R.drawable.discoduroseagate,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "DISCO DURO SEAGATE PIPELINE HD 1TB 5900RPM SATAIII 6GB/S 64M INTERNAL\n" +
                    "ST1000VM002\n" +
                    "Descripción\n" +
                    "Perfil operativo 24 × 7 para satisfacer las demandas siempre activas en el mercado de DVR\n" +
                    "Puede entregar de manera confiable hasta 20 transmisiones simultáneas de contenido HD\n" +
                    "Consumo de energía súper bajo en todos los modos de energía\n" +
                    "Las unidades geniales brindan beneficios duraderos a la PC o unidad externa, reduciendo algunos costos de componentes y mantenimiento\n" +
                    "Cumple y excede los requisitos de los clientes ecológicos\n" +
                    "Ofrece ahorro de energía\n" +
                    "Construido según los exigentes estándares verdes de Seagate:\n" +
                    "Cumple con la directiva RoHS\n" +
                    "Por lo general, el 70 por ciento o más de los materiales utilizados para construir la unidad se pueden reciclar.\n" +
                    "Diseñado, construido y entregado utilizando los mejores procesos respetuosos con el medio ambiente.\n" +
                    "Capacidad de 1 TB",false))

        productos.add(ProductosCardView("Disco Duro Externo Toshiba Canvio Basics Usb 3.0 2 TB","S/ 436.00","324",R.drawable.discoduroexternocanvio,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Disco de almacenamiento portátil. Operación fácil de conectar y usar\n" +
                    "Gran capacidad de 2TB en un pequeño dispositivo.\n" +
                    "Diseñado para ordenadores con Windows y formateable para Mac u otros sistemas.\n" +
                    "2.5' external\n" +
                    "Puerto SuperSpeed USB 3.0\n" +
                    "Alimentación USB",false))

        productos.add(ProductosCardView("Disco Duro Externo Seagate 2TB 3.0 Basic Portátil","S/ 400.00","329",R.drawable.discoduroexternoseagate,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Rápidas velocidades de transferencia\n" +
                    "Carcasa compacta\n" +
                    "Sencillo Funcionamiento\n" +
                    "Ideales para proteger o ampliar tus datos\n" +
                    "Fácil y portátil de almacenar",false))

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