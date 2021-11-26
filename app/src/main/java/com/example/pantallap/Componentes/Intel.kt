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

class Intel : Fragment() {

    companion object {
        fun newInstance() = Intel()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.intel, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycleCompo)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("Procesador Intel Core i7-10700, 2.90 GHz, 16 MB Caché L3, LGA1200, 65W","S/ 4,000.00","2230",R.drawable.intelcorei7,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Procesador Core i7 10700\n" +
                    "INTEL HD GRAPHICS 630\n" +
                    "CACHE L3 16 MB\n" +
                    "NUCLEOS 8\n" +
                    "HILOS 16\n" +
                    "LGA 1200",false))

        productos.add(ProductosCardView("Procesador Intel Core I7-9700 410GHz 12MB de cache","S/ 2,700.00","2500",R.drawable.intelcorei79700,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Familia Procesadores\n" +
                    "Marca Intel\n" +
                    "Modelo i7-9700\n" +
                    "Cód. Interno 103251\n" +
                    "Generación 9ª generación de procesadores Intel® Core™ i7\n" +
                    "Cantidad de Núcleos 8\n" +
                    "Frecuencia básica 3.00 GHz\n" +
                    "Frecuencia Máxima 4.70 GHz\n" +
                    "Caché 12MB\n" +
                    "Velocidad Bus 8 GT/s\n" +
                    "Gráficos Integrados Gráficos UHD Intel® 630\n" +
                    "Zócalo Compatible FCLGA1151",false))

        productos.add(ProductosCardView("Procesador Intel Core i9-11900K 3.50/5.30 GHz 16 MB Caché L3 LGA1200","S/ 3,600.00","3500",R.drawable.intelcorei9,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "MARCA: INTEL\n" +
                    "FAMILIA: CENTRO\n" +
                    "LINEA: Procesador Core i9 S1200 11XXX-Onceava Generacion\n" +
                    "NUMERO DE MODELO DE PROCESADOR: NUMERO DE PROCESADOR i9-11900K NUMERO DE MODELO DE CAJA BX8070811900K\n" +
                    "ENCHUFE: LGA1200 INTEL\n" +
                    "BASE VELOCIDAD: 3,50 GHz\n" +
                    "VELOCIDAD MAXIMA DEL NUCLEO: 5.30 GHZ\n" +
                    "MEMORIA CACHE: CACHE L3 16 MB\n" +
                    "NUMERO DE NUCLEOS: 8\n" +
                    "NUMERO DE HILOS: dieciséis\n" +
                    "TDP: 125 W\n" +
                    "TEMPERATURA DE OPERACION: TJUNCION 100 °C\n" +
                    "SOLUCION TERMICA: PCG 2019A\n" +
                    "ESPECIFICACION DE MEMORIA: TAMAÑO MAXIMO DE MEMORIA 128 GB INTERFAZ DE MEMORIA DDR4 CANALES DE MEMORIA 2\n" +
                    "PROCESADOR GRAFICO: GRÁFICOS INTEL UHD 750\n" +
                    "CONTROLADOR DE GRAFICOS INTEGRADO: SI\n" +
                    "TECNOLOGIA: 14 NM (NANOMETROS)\n" +
                    "TECNOLOGIA INTEL: COMPATIBLE CON LA MEMORIA INTEL OPTANE HYPER-THREADING INTEL BOOT GUARD SECURE KEY TURBO BOOST 2.0 TURBO BOOST MAX 3.0 VIRTUALIZACIÓN (VT-X) VIRTUALIZACIÓN PARA E/S DIRIGIDA (VT-D)\n" +
                    "PRESENTACION: CAJA",false))

        productos.add(ProductosCardView("Procesador Intel Core I5-7640X, 4.00 GHz, 6 MB Caché L3, LGA2066, 112W, Tecnología 14 Nm","S/ 1,899.00","1439",R.drawable.intelcorei5,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Zócalo LGA 2066\n" +
                    "Compatible con Chipset Intel® X299\n" +
                    "4 hilos / 4 hilos\n" +
                    "Número máximo de carriles PCI Express 16\n" +
                    "Disponibilidad de memoria Intel® Optane ™ y soporte para SSD Intel® Optane ™",false))

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